CREATE DATABASE IF NOT EXISTS coupon_db;

-- Create the coupon template data table
DROP TABLE IF EXISTS `coupon_db`.`coupon_template`;

CREATE TABLE IF NOT EXISTS `coupon_db`.`coupon_template` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
    `available` boolean NOT NULL DEFAULT false COMMENT 'coupon availability status',
    `name` varchar(64) NOT NULL DEFAULT '' COMMENT 'coupon name',
    `description` varchar(256) NOT NULL DEFAULT '' COMMENT 'coupon details',
    `type` int(10) NOT NULL COMMENT 'coupon types',
    `shop_id` bigint(20) COMMENT 'If the coupon is valid in the store, if it is empty, it is valid in the whole store',
    `created_time` datetime NOT NULL DEFAULT '2021-12-13 00:00:00' COMMENT 'creation time',
    `rule` varchar(2000) NOT NULL DEFAULT '' COMMENT 'detailed usage rules',
    PRIMARY KEY (`id`),
    KEY `idx_shop_id` (`shop_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='coupon templates';

DROP TABLE if exists  `coupon_db`.`coupon` ;
CREATE TABLE IF NOT EXISTS `coupon_db`.`coupon` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `template_id` int(20) NOT NULL DEFAULT '0' COMMENT 'primary key',
    `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'the ID of the user who owns the ticket',
    `created_time` datetime NOT NULL DEFAULT '2021-12-13 00:00:00' COMMENT 'coupon collection time',
    `status` int(2) NOT NULL DEFAULT '0' COMMENT 'the status of the coupon, such as unused or used',
    `shop_id` bigint(20) COMMENT 'redundant fields for easy lookup',
    PRIMARY KEY (`id`),
    KEY `idx_user_id` (`user_id`),
    KEY `idx_template_id` (`template_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='coupon';