package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(final String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
