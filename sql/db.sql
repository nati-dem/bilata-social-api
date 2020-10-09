-- start db script

DROP DATABASE IF EXISTS bilata_influencers_app;

CREATE DATABASE IF NOT EXISTS bilata_influencers_app;

use bilata_influencers_app;

CREATE TABLE IF NOT EXISTS users (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  user_type ENUM('client', 'influencer', 'admin', 'moderator'),
  status ENUM('active', 'inactive', 'pending', 'deleted'),
  address VARCHAR(128) NULL,
  city VARCHAR(50) NULL,
  country VARCHAR(50) NULL,
  reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS clients (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  user_id INT(6) UNSIGNED UNIQUE NOT NULL,
  company_name VARCHAR(50) NOT NULL,
  description VARCHAR(255) NULL,
  category VARCHAR(50) NULL,
  company_phone VARCHAR(50) NULL,
  company_email VARCHAR(50) NULL,
  company_address VARCHAR(128) NULL,
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS influencers (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  user_id INT(6) UNSIGNED UNIQUE NOT NULL,
  ig_username VARCHAR(50) NULL,
  fb_username VARCHAR(50) NULL,
  bio VARCHAR(255) NULL,
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS followers (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  user_id INT(6) UNSIGNED NOT NULL,
  target_user_id INT(6) UNSIGNED NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (target_user_id) REFERENCES users(id),
  cur_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS messages (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  from_user INT(6) UNSIGNED NOT NULL,
  to_user INT(6) UNSIGNED NOT NULL,
  content VARCHAR(255) NOT NULL,
  status ENUM('sent', 'read', 'deleted'),
  FOREIGN KEY (from_user) REFERENCES users(id),
  FOREIGN KEY (to_user) REFERENCES users(id),
  cur_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
