# Experiment 7 — Adaptive UI using ListView and ImageView

## Student Information

- **Name:** Vishwajeet Singh
- **USN:** 25MCAR0219
- **Course:** MCA
- **Experiment:** 7
- **Platform:** Android Studio
- **Language:** Kotlin
- **UI:** XML

---

## 1. Experiment Title

**Create an Adaptive UI using ListView and ImageView**

---

## 2. Aim

To create an adaptive Android user interface using `ListView` and `ImageView`, where multiple student records are displayed dynamically with profile images, names, USN numbers, and course details.

---

## 3. Objective

The objectives of this experiment are:

- To understand the use of `ListView` in Android.
- To understand the use of `ImageView`.
- To create a custom ListView item layout.
- To use a custom adapter to connect data with the UI.
- To implement item-click functionality.
- To design a clean and authentic student directory interface.
- To test the application using different test cases.

---

## 4. Scenario

A **Student Directory App** is developed for a university department. The application displays a list of students with their profile image, name, USN, and course.

The first student record contains the student's own name and USN to demonstrate the required identity-based test case.

Example:

- **Name:** Vishwajeet Singh
- **USN:** 25MCAR0219
- **Course:** MCA • Machine Learning

---

## 5. Technologies Used

| Technology | Purpose |
|---|---|
| Android Studio | Application development |
| Kotlin | Programming language |
| XML | UI design |
| ListView | Displaying a scrollable list |
| ImageView | Displaying student images |
| BaseAdapter | Connecting data with custom ListView items |
| Drawable Resources | Storing images and UI backgrounds |

---

## 6. Concepts Used

### ListView

`ListView` is an Android UI component used to display a vertically scrollable list of items.

### ImageView

`ImageView` is used to display images such as student profile pictures.

### Custom Adapter

A custom adapter is used to connect the student data with the custom ListView layout.

### Custom Layout

Each student is displayed inside a card containing:

- Profile image
- Student name
- USN
- Course

### Item Click Listener

`setOnItemClickListener()` is used to detect when a user selects a student from the list.

---

## 7. Features

- Clean student directory interface.
- Scrollable student list.
- Profile images using ImageView.
- Student name and USN display.
- Course information.
- Custom card-style ListView items.
- Toast message on item selection.
- Responsive/flexible layout using XML dimensions.
- Personal USN and name included for testing.

---

## 8. Project Structure

```text
Experiment7
│
├── app
│   └── src
│       └── main
│           ├── java/com/example/experiment7
│           │   ├── MainActivity.kt
│           │   ├── Student.kt
│           │   └── StudentAdapter.kt
│           │
│           ├── res
│           │   ├── drawable
│           │   │   ├── student1.png
│           │   │   ├── student2.png
│           │   │   ├── student3.png
│           │   │   └── student_card.xml
│           │   │
│           │   ├── layout
│           │   │   ├── activity_main.xml
│           │   │   └── student_item.xml
│           │   │
│           │   └── values
│           │       ├── colors.xml
│           │       ├── strings.xml
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
├── screenshots
│   ├── output.png
│   ├── test-case-1.png
│   ├── test-case-2.png
│   └── test-case-3-usn.png
│
└── README.md
```

---

## 9. Main Components

### MainActivity.kt

`MainActivity` initializes the ListView, creates the student data, connects the custom adapter, and handles item clicks.

### Student.kt

The `Student` data class stores:

```text
name
usn
course
imageResId
```

### StudentAdapter.kt

The custom adapter takes the student data and displays it using `student_item.xml`.

### activity_main.xml

This file contains the main application screen, including:

- Header
- Section title
- ListView

### student_item.xml

This file defines the design of each student card.

### student_card.xml

This drawable provides the white card background, rounded corners, and border.

---

## 10. Sample Student Data

| Name | USN | Course |
|---|---|---|
| Vishwajeet Singh | 25MCAR0219 | MCA • Machine Learning |
| Rahul Kumar | 25MCAR0205 | MCA • Data Science |
| Aman Sharma | 25MCAR0210 | MCA • Cloud Computing |
| Priya Singh | 25MCAR0221 | MCA • Artificial Intelligence |

---

## 11. Implementation Procedure

1. Open Android Studio.
2. Create a new Empty Views Activity project.
3. Select Kotlin as the programming language.
4. Create `Student.kt`.
5. Create `StudentAdapter.kt`.
6. Create `student_item.xml`.
7. Create `student_card.xml`.
8. Replace the existing `activity_main.xml`.
9. Replace the existing `MainActivity.kt`.
10. Add student images inside the `drawable` folder.
11. Build and run the application.
12. Verify the student list.
13. Tap different students and verify the Toast message.
14. Capture screenshots for the required test cases.
15. Add the screenshots and README to GitHub.

---

## 12. Test Cases

### Test Case 1 — Student List Display

**Test Objective:** Verify that all student records are displayed correctly.

**Steps:**
1. Launch the application.
2. Observe the Student Directory screen.
3. Scroll through the list.

**Expected Result:**  
The application should display student images, names, USN numbers, and course information in a scrollable ListView.

**Screenshot:**  
Add `test-case-1.png`.

---

### Test Case 2 — Student Selection

**Test Objective:** Verify ListView item click functionality.

**Steps:**
1. Launch the application.
2. Select a student from the list.
3. Observe the Toast message.

**Expected Result:**  
A Toast message should appear with the selected student's name.

Example:

```text
Rahul Kumar selected
```

**Screenshot:**  
Add `test-case-2.png`.

---

### Test Case 3 — USN and Name Verification

**Test Objective:** Verify that the student's name and USN are displayed correctly.

**Steps:**
1. Launch the application.
2. Locate the first student.
3. Verify the name and USN.

**Expected Result:**

```text
Vishwajeet Singh
25MCAR0219
MCA • Machine Learning
```

The student's profile image should also be visible.

**Screenshot:**  
Add `test-case-3-usn.png`.

---

## 13. Output

The final application displays a clean student directory with:

- A professional header.
- Student profile images.
- Student names.
- USN numbers.
- Course details.
- Scrollable ListView.
- Click interaction with Toast feedback.

### Output Screenshot

Add the final application screenshot here:

```text
screenshots/output.png
```

---

## 14. Screenshots

### Main Output

<img width="720" height="1600" alt="WhatsApp Image 2026-09-25 at 11 13 44 PM" src="https://github.com/user-attachments/assets/9ae43fb3-1a5d-46c9-a69e-ff8a721235a7" />
![Main Output](screenshots/output.png)

### Test Case 1

<img width="720" height="1600" alt="WhatsApp Image 2026-09-25 at 11 13 44 PM (1)" src="https://github.com/user-attachments/assets/8f090394-925e-4449-b3da-fa8168dfde83" />
![Test Case 1](screenshots/test-case-1.png)


## 16. Result

The adaptive UI using `ListView` and `ImageView` was successfully implemented in Android Studio using Kotlin and XML.

The application successfully displays multiple student records with profile images, names, USN numbers, and course information. A custom adapter was used to connect the data with the ListView, and item-click functionality was implemented using `setOnItemClickListener()`.


This experiment demonstrates how `ListView`, `ImageView`, custom layouts, and adapters can be combined to create a structured and interactive Android user interface. The Student Directory scenario provides a practical example of displaying multiple records in a scrollable and user-friendly format.

## 17. 👨‍💻 Author

Vishwajeet Singh
MCA Student
USN: 25MCAR0219
University: Jain (Deemed-to-be University), Bengaluru
GitHub: Vishwajeetsingh22
