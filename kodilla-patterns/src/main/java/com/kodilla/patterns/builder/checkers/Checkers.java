package com.kodilla.patterns.builder.checkers;

public class Checkers {
    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    private Checkers(final Board board, final String playerOne, final String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class CheckersBuilder {
        private Board board = new Board();
        private String playerOne = "";
        private String playerTwo = "";

        public CheckersBuilder playerOne(final String playerOne) {
            this.playerOne = playerOne;
            return this;
        }

        public CheckersBuilder playerTwo(final String playerTwo) {
            this.playerTwo = playerTwo;
            return this;
        }

        /**Method creates new figure and sets on the board.*/
        public CheckersBuilder figure(final String figureType, final String figureColor, final int x, final int y) {
            if (x > Board.MAX_INDEX || x < Board.MIN_INDEX ||
                    y > Board.MAX_INDEX || y < Board.MIN_INDEX) {
                throw new IllegalStateException("x and y should be in range between " +
                        Board.MIN_INDEX + " and " + Board.MAX_INDEX);
            }
            if (board.getFigure(x, y) == null) {
                board.setFigure(FigureFactory.makeFigure(figureType, figureColor), x, y);
            } else {
                throw new IllegalStateException("Position " + x + "," + y + " is already occupied");
            }
            return this;
        }

        /**Method creates new object if it fulfills several conditions.*/
        public Checkers build() {
            if (playerOne.length() == 0) {
                throw new IllegalStateException("There is no player One specified!");
            }
            if (playerTwo.length() == 0) {
                throw new IllegalStateException("There is no player Two specified");
            }
            boolean white = false;
            boolean black = false;
            for (int x = Board.MIN_INDEX; x <= Board.MAX_INDEX; x++) {
                for (int y = Board.MIN_INDEX; y <= Board.MAX_INDEX; y++) {
                    Figure figure = board.getFigure(x, y);
                    if (figure != null) {
                        if (figure.getColor().equals(Figure.BLACK)) {
                            black = true;
                        } else {
                            white = true;
                        }
                    }
                }
            }
            if (!(black && white)) {
                throw new IllegalStateException("There are no figures of both colors on the board!");
            }
            return new Checkers(board, playerOne, playerTwo);
        }
    }
}
