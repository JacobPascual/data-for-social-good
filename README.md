# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

As a food influencer, 
I want to gather data about the best reviewed underground restaurants
so that I can choose where to critique and advertise

## Dataset 

Dataset: https://www.kaggle.com/datasets/joebeachcapital/restaurant-reviews
- **Restaurant** (String) - name of the restaurant
- **Rating** (int) - rating of the restaurant out of 5

## UML Diagram 

![UML Diagram for my project](![alt text](<Copy of UML Diagram.png>)) 

## Description 

Our project is an app that provides information for food influencers, critiques, etc. It uses a dataset with 10,000 instances of values and 100 unique ones, that include information about restaurant reviews including the name, rating out of 5, character review, images, and reviewer names. The dataset allows users to see how popular and how well or badly rated certain restaurants are. In our project, we used the ratings and name columns and stored them into 1D arrays for our program to run. Our algorithm also incorperates an entity class to "combine" the two arrays into one object so that the information is easier to collect.