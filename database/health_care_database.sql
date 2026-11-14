create database health_care;

use health_care;

CREATE TABLE patient_detalis
(
    patient_ID INT(11),
    patient_Name VARCHAR(20),
    addmission_date VARCHAR(20),
    gender VARCHAR(10),
    room_number INT(11),
    blood_group VARCHAR(10),
    address VARCHAR(50),
    age INT(11),
    phone VARCHAR(11)
);


CREATE TABLE doctor_detalis
(
    doctor_id INT(11),
    doctor_name VARCHAR(20),
    gender VARCHAR(10),
    hiredate DATE,
    age INT(11),
    phone VARCHAR(11),
    room_number INT(11),
    blood_group VARCHAR(10),
    specialist VARCHAR(50),
    address VARCHAR(100)
);


CREATE TABLE employee (employee_id INT, employee_name VARCHAR(20), hiredate DATE, gender VARCHAR(10), job VARCHAR(20), blood_group VARCHAR(10), address VARCHAR(50), age INT, phone VARCHAR(10));


CREATE TABLE medical_record (md_id BIGINT, md_name VARCHAR(250), expiry_date DATE, stock BIGINT, purchase_price BIGINT, sales_price BIGINT, purchase_date DATE, sales_date DATE);


CREATE TABLE medicine_bill (bill_no BIGINT, `date` DATE, md_id VARCHAR(1000), md_name VARCHAR(1000), quantity VARCHAR(1000), amount VARCHAR(255), total_amount BIGINT);


CREATE TABLE account (username VARCHAR(20), nikname VARCHAR(10), phone_no VARCHAR(20), email VARCHAR(50), passwoard VARCHAR(30), fullname VARCHAR(40));


CREATE TABLE appointment (app_id BIGINT, patient_name VARCHAR(50), patient_number BIGINT, doctor_name VARCHAR(50), `date` DATE, `time` VARCHAR(30), status VARCHAR(30));


CREATE TABLE billing_detalis (bill_no BIGINT, bill_date DATE, patient_id BIGINT, description VARCHAR(900), amount VARCHAR(900), doctor_name VARCHAR(50), total_amount BIGINT, status VARCHAR(20));


CREATE TABLE sales_report (md_id BIGINT, md_name VARCHAR(255), sales_date DATE, sales_quantity BIGINT);


CREATE TABLE purchase_report (md_id BIGINT, md_name VARCHAR(40), purcahse_date DATE, purchase_quantity BIGINT);


CREATE TABLE attendance (id BIGINT, `name` VARCHAR(20), `number` BIGINT, `date` DATE, `time` VARCHAR(30), `type` VARCHAR(30), status VARCHAR(40));


CREATE TABLE user_account (username VARCHAR(255), full_name VARCHAR(255), phone BIGINT, last_login VARCHAR(90), last_logout VARCHAR(100), status VARCHAR(40) DEFAULT 'Inactive' , roll VARCHAR(200), s_no BIGINT);



