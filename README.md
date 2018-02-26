
# cs56-android-quiz

## COMMENTS LEFT BY DUMMYINDEX, THE SECOND GROUP( INDIVIDUAL WORKED ON THIS PROJECT)

If it is your first time view this repo, please skip this section. This seciont is at top for convenience of future developers.

### New Features:
A brand-new expression calculator.
I used JEval library. Please read their documentation to understand my code( a wrapper ), though it is extremely easy. 
PageViewer for swipe.
A new Convertor written on my own without extra library. 
The "MyUtil" class I created contains a bunch of useful helper methods to do frequent jobs.

I separate calculator classes and activity classes. Please follow this style.


### Possible New Features:
They are listed in the issue list.
I recommend solve spark backend issue if you have never written a web server backend. Certainly, 300-400pts is a lot.
Linear Algebra Calculator is really a cool thing you can create. I recommend, like I did before, create a separate class for linear algebra calculator. If you decide to write it by hand, I recommend implement separate classes for vector and matrix. I did something like this before in 2015 during UCSB FSSP and it was working. However I wrote it in Python. [Here's my REPO for my linear algebra utility with naive implementation](https://github.com/dummyindex/linear_algebra)


### General Issues (For refactor) :
(Comments, may be skipped) This code was messy when I got it, with several misterious long methods and implementations. Now it is still a little messy. However, the logic is simple, so please do not freak out, just read through their code. Refactor, of course, is necessary, but I did not do that this quarter.

You may find some onClickListener declared in XML layout files, not programmatically, and others set programmatically in onCreate file. It is nice of you to use the same styles. ( I prefer programmtically set with setOnClickListener.) 

The Convertor Activity and Expression Activity currently are not related to their corresponding framents. You may refactor by using FragmentActivity.

I have fixed most of the bugs and awkward code that I cannot tolerate. One of them took me 3 hours. PLEASE UTILIZE ANDROID STUDIO'S DEBUG MODE, WHICH MAY SAVE YOUR LIFE.




## Brief Update March 3rd, 2016

Fixed if button was pressed, no input was given, application would crash. Implemented a percentage score for quiz. Revamped README.md. 
## Project History

| Details      | -              | -                  |
| -------------|----------------|--------------------|
| Creators     | Henry Yu       | Phillip Fry        |
| Instructors  | Phillip Conrad | Allison Shedded    |
| Winter 2016  | CS 56          | UCSB               |

## What is This?

This is a "made from scratch" Android Application built with Android Studio. It contains a simple calculator followed by a selection of number conversion quizzes. This is a legacy code project for an undergraduate computer science course at the University of California, Santa Barbara. The project stems from an already existing project written in Java: https://github.com/UCSB-CS56-Projects/cs56-math-conversion-quiz

## Goal

The ultimate goal of this project is to translate the entirety of the old Java Application Project into an Android Application. The old Java Application contains binary conversion (from any radix to binary), decimal conversion (from any radix to decimal), octal conversion (from any radix to octal), hexadecimal conversion (from any radix to hexadecimal), random conversion (the default mode, from any radix to any radix), and a masking conversion (only with binary).

## How to Run?

Download the lastest version of Android Studio at the following link: http://developer.android.com/sdk/index.html. Git clone this repository and open the project folder inside Android Studio and running it should be smooth. Make sure you have the latest SDK installed and updated.

## How does the Application Work?

Run the app by clicking Run on Android Studio. Choose any Android Device as your emulator and the application should start. You will be prompted with a welcome screen, after which you are invited to type in your name and a welcome message will be displayed. Next screen is a simple calculator you can play around with. Following is the quiz itself, which contains checkboxes for the types of conversions (ie. Decimal to Binary or Octal to Hexadecimal) and radio buttons for the length of the quiz (ie. 6 questions, 12 questions, etc.) You will then be prompted with the quiz interface itself, where a number is given and the user will be prompted to type in the correct conversion. A "Change Number" feature is added if the current problem is too difficult. A "Percentage" feature has also been implemented to tell the user how well they are doing as they are progressing throughout the quiz. 

## Javadoc
JavaDoc Link: http://ucsb-cs56-projects.github.io/cs56-android-conversion-showdown/javadoc/

## Screenshots

Screenshots of the running Application goes here. <br />
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/EntryScreen.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/WelcomeScreen.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/Calculator.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/TestSelection.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/QuizBasic.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/QuizBinaryE.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/QuizOctalE.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/QuizIncorrect.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/ResultBad.PNG)
![Alt tag](https://github.com/henryhyu/android-quiz/blob/master/app/src/main/res/readmePic/ResultGood.PNG)


## Legacy Code Issues

Will be present in the "Issues" tab of this repository. https://github.com/henryhyu/android-quiz/issues


## Project Point Distribution

| Points       | Topic                                                          | Driver/Nagivator |
| -------------|----------------------------------------------------------------|------------------|
|  150         |  README.md                                                     | H.Y./P.F.        |
|  100         |  Learning Android                                              | H.Y./P.F.        |
|  50          |  Graphical Welcome Screen (1st Activity)                       | H.Y./P.F.        |
|  75          |  Introduction Screen (2nd Activity)                            | H.Y./P.F.        |
|  100         |  Calculator (3rd Activity)                                     | H.Y./P.F.        |
|  100         |  Quiz Selection Screen (4th Activity)                          | P.F./H.Y.        |
|  250         |  (Initial) Binary to Decimal Conversion (5th Activity)         | P.F./H.Y.        |
|  100         |  Decimal to Octal                                              | P.F./H.Y.        |
|  100         |  Binary to Octal                                               | P.F./H.Y.        |
|  150         |  Hex to Decimal, Hex to Binary, Hex to Octal                   | P.F./H.Y.        |
|  75          |  Score Report (6th Activity)                                   | P.F./H.Y.        |
|  100         |  Basic App Logic/Structure (Quality Assurance)                 | H.Y./P.F.        |
|  50          |  Transparency for the written code via Comments                | P.F./H.Y.        |
|  100         |  Front End Aesthetics                                          | H.Y./P.F.        |
| Total        |  1500 Points                                                   | -                |

## Activity Descriptions:

Learning Android Explanation: Beginning the app/learning how android studio works in regards to activities/manifest/xml

Graphical Welcome Screen (1st Activity): Landing page welcome screen with designed logo and button that directs user to the next page.

Introduction Screen (2nd Activity): Introduction page that welcomes the user when the name is inputted. Directions are given and a button directs user to the next page.

Calculator (3rd Activity): A simple calculator that does addition, subtraction, multiplication, division. Division by zero is accounted for and empty inputs are also accounted for.

Quiz Selection Screen (4th Activity): Selection screen for the quiz. There are checkboxes for the types of conversions. Unchecked/checked boxes are accounted for. Radio buttons are used to signify the length of the tests.

(Initial) Binary to Decimal Conversion (5th Activity): The actual quiz itself. Does the math for the conversion. Invalid + no inputs are accounted for. A percentage score has been implemented as well. Abort button implemented to export current score (directs user to score report screen)

Decimal to Octal, Binary to Octal: Implemented different conversions for the quiz.

Score Report (6th Activity): Score report for the end of the quiz. Color corresponds to the user's score (ie. 100% = green. 50% = red). User can start a new quiz or go back to the calculator screen.

Basic App Logic/Structure Explanation: ie. Making sure text boxes are not empty, check boxes are checked, radio buttons are clicked. Making sure buttons go to the right activity, error handling, etc. making sure works on multiple android devices, etc.

## Lab 07 (Pre 500 Points README.md Old)
Progress and Point Breakdown:

Downloaded Android Studio. Familiarized with Java files vs. XML files.

Configured Android Manifest file. Familiarized with Layouts, Listeners, Widgets, etc.

Created 3 Activities:

1) Welcome Screen in which it prompts the user to enter their name. After pressing enter, their name will show up as a welcome message. There is a button that directs the user to the next screen.

2) Calculator Screen in which it is a simple calculator application with Addition, Subtraction, Multiplication, Division. There is a button that directs the user to the next screen.

3) Quiz Intro Screen that prompts the user for what they would like to be quizzed on. We still need to figure out how to make sure the display looks the same on different devices. On smaller screen simulators there is some overlap in the text (resolved). It works on an andorid device properly (HTC ONE M8).

## Finished Activities:

4) Quiz Activity which tests the users knowledge of numeric conversions (still in progress, does all conversions)
Only issue is when the user enters a hex letter (any letter) the app test will stop. We couldn't find a way to make an exception for this and using the method parseInt(string, 16) does not work on converting the user answer to decimal for comparison.

5) Score Report Screen displays the users final score and will change the background depending on the percentage the user got on the quiz. It also has two buttons that allow the user to use the calculator or create a new test.

## F17 Final Remarks

For the next group taking on this legacy project, we highly recommend you to put javadoc as the first item in your to-do list. Reading through the current javadoc will give you minimum understanding of each class’s functionality and the current working progress of this android app. After that, you will realize that javadoc requires further refinement and amendment to the current version. Completing this task, I believe, will greatly extend your knowledge about android programming and application workflow giving you a head start for making more contributions to this project later. Moreover, another issue we suggest you dealing with is saving states issue. This problem is all over the place and occurs again and again. Such issue can cause many bugs, such as textbox disappearing or unexpected score resetting. Each time you have a bug, you should think whether unsaving states is the reason or saving states can be the solution. Please try your best to fix it. It takes time but very worth a try because this is a hard problem that even combining the effort of three talented group cannot solve. Solve it and be proud of yourselves. At last, note that android programming is a time-consuming and painstaking process. You will encounter numerous obstacles and setbacks. However, you should be patient. Google. Youtube, and StackOverflow will help you a lot and save your life. So good luck!

## W16 Final Remarks
https://github.com/UCSB-CS56-Projects/cs56-android-getting-started/tree/master/docs/tutorial 
<br />
We would recommend that the next students who decide to work on this project look at the link above to help them get a basic understanding of coding for android if they have no prior experience. I would look at the comments of the code, they should explain some basic operations in android application (look at button push methods in Quiz selection Activity to see how to transfer data from one activity to another). Also, look at the xml files to learn more about formatting. This application works entirely and will only shut down if a hex letter or any keyboard symbol is entered in the AnswerField of the Quiz Activity. Exceptions were created for the other numeric conversions, but we could not find out how to create an exception for invalid inputs of Hex numbers. If the user inputs a Hex number that doesn't have a letter in it, the comparison will still work properly. If we had more time we would have made the layout of the app keep functionlity when it is rotated landscape, we would have made the exceptions that restrict the user from putting invalid inputs into the Answerfield for Hex answers, and we would have made the app provide more detalied feedback that could analyze the users strengths and weaknesses if they select multiple conversion types. Some other ideas that you could incorporate into the app to practice some basics would be making a few activities that could explain how the number conversions are done, and maybe make it an even more useful tool by making an activity that allows the user to input either a decimal, hex, or octal number and have the app convert it for them. 

## F16 Final Remarks

Taking on a android application is going to be different than tackling a web application like the other legacy codes. When first looking at the project, it can be intimidating and difficult to understand, but it is very rewarding and interesting to learn how to develop an android application. There will be a huge learning curve when you first start working with the code. Android TutorialPoint is a great source for developing an understanding of the Android framework and its functions.

The application concept is fairly simple and the code behind it can be easily understood by examining the classes, The main idea of this application is to be a quiz application to test a user’s ability to convert a number from one base to another. This part of the application seemed to have been completed early on and has been extended to adding more features you could do with bases such as the base converter and base calculator. The greatest learning experience you could take on is creating your own activity that you could add to the application and developing both the frontend and backend code for the activity. This will ensure your understanding of Android as well as give you a taste of application development.

A huge problem with this application was the user interface. A lot of the existing pages were not well designed or user friendly. This definitely was not an application that looked appealing to use. A consistent theme has begun to form during the Fall 2016 quarter but has not been extended into the quiz portion of the application. Consider improving the user interface and theme of the quiz to something the general public would be interested in using.

Some words of advice would be to really choose a legacy project that you are interested in and something you can learn from. When my partner and I took on this project, we both knew that we would have to do a lot of research and spend a lot of time working with this code. In the end, we found it extremely rewarding that we now knew how an android application works and we could develop something of the sort on our own. Advice for working on the actual code would be to use the android studio debugging feature when testing your code. Using this will help identify the source of the problem and can save you from sitting there bewildered about why the application crashed. Good luck on your quarter and I hope you enjoy your legacy project as much as we enjoyed it.
