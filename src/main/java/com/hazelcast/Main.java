package com.hazelcast;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Config config = new Config();
        config.setProperty("hazelcast.logging.type", "log4j");
        Hazelcast.newHazelcastInstance(config);
    }
}
