# University Student Record and Campus Route Management System

## CIT300 – Data Structures and Algorithms
### Graded Practical Assignment 1

---

## Project Overview

The **University Student Record and Campus Route Management System** is a Java console-based application developed for the CIT300 Data Structures and Algorithms module.

The system demonstrates the practical implementation of multiple data structures to manage:

- University student records
- Student service requests
- Recent system actions
- Student searching
- Campus locations
- Campus routes and connections

The project uses the following data structures and algorithms:

- Linked List
- Stack
- Queue
- Binary Search Tree (BST)
- Hash Table
- Graph
- Breadth First Search (BFS)

---

## Objectives

The main objectives of the system are to:

- Store, add, update, delete, search and display student records.
- Use a **Linked List** for student record management.
- Use a **Stack** for recent action history.
- Use a **Queue** for student service requests.
- Use a **Binary Search Tree** to organize student records.
- Use **Hashing** for efficient Student ID searching.
- Use a **Graph** to represent campus locations and connections.
- Add and remove campus locations.
- Add and remove campus connections.
- Display campus connections.
- Traverse campus locations using **BFS**.
- Provide a menu-driven Java console interface.
- Handle invalid input and invalid operations.

---

## Student Record Details

Each student record contains:

| Field | Description |
|---|---|
| Student ID | Unique identification number of the student |
| Name | Name of the student |
| Programme | Academic programme |
| Marks | Student marks from 0 to 100 |

Example:

```text
Student ID : S001
Name       : Ahmed Rizwan
Programme  : BAIT
Marks      : 78.5
```

---

## Team Members and Contributions

| No. | Student Name | Student ID | Role | Responsibility | Individual Contribution | Branch |
|---|---|---|---|---|---|---|
| 1 | ABM. Rimzath | 23DA2-0687 | **Team Leader** | Linked List and Student Record Management | Student model, add, search, update, delete and display student records | `member1-linkedlist` |
| 2 | MFM. Usama | 23DA2-0971 | Member | Stack and Queue Implementation | Recent action history and student service request management | `member2-stack-queue` |
| 3 | AGM. Sujath | 23DA2-1133 | Member | BST and Hashing Implementation | BST insertion/search/display and Hash Table insertion/search/removal | `member3-bst-hashing` |
| 4 | ANM. Imthath | 23DA2-0882 | Member | Graph and BFS Implementation | Campus locations, connections, removal, network display and BFS traversal | `member4-graph` |

As team leader, Member 1 (ABM. Rimzath) additionally coordinated branch merging, integration of all members' work into `Main.java`, and overall project submission.

---

## Member 1 Contribution — ABM. Rimzath (Team Leader)

**Responsibility:** Linked List implementation, Student Record Management, and overall project/team coordination.

**Branch:** `member1-linkedlist`

**Files:**
- `Student.java`
- `StudentLinkedList.java`

**Individual Contribution:**

Member 1 implemented:
- Student model (Student ID, name, programme and marks fields)
- Add student operation
- Search student operation
- Update student operation
- Delete student operation
- Display all student records
- Duplicate Student ID validation
- Linked List implementation

As team leader, Member 1 also:
- Coordinated task allocation across all members
- Oversaw branch merging and integration into `main`
- Reviewed and finalized `Main.java`
- Compiled and finalized the project README and submission

**Main.java Contribution:**

Member 1 integrated:
1. Add Student Record
2. Update Student Record
3. Delete Student Record
4. Display All Records using Linked List

**Main.java Commit:**

```text
feat: integrate student record and linked list operations into Main
```

---

## Member 2 Contribution — MFM. Usama

**Responsibility:** Stack and Queue implementation and related operations.

**Branch:** `member2-stack-queue`

**Files:**
- `ActionStack.java`
- `ServiceRequest.java`
- `ServiceQueue.java`

**Individual Contribution:**

Member 2 implemented:

*Stack*
- Stack Node implementation
- Push operation
- Pop operation
- Empty Stack validation
- Recent action history
- Display recent actions

*Queue*
- Service Request model
- Queue Node implementation
- Enqueue operation
- Dequeue operation
- FIFO request processing
- Empty Queue handling
- Display service requests

**Main.java Contribution:**

Member 2 integrated:
5. Add Service Request to Queue
6. Process Next Service Request
7. Display Recent Actions using Stack

**Main.java Commit:**

```text
feat: integrate stack and service queue operations into Main
```

---

## Member 3 Contribution — AGM. Sujath

**Responsibility:** Binary Search Tree and Hashing implementation.

**Branch:** `member3-bst-hashing`

**Files:**
- `StudentBST.java`
- `StudentHashTable.java`

**Individual Contribution:**

Member 3 implemented:

*Binary Search Tree*
- BST Node implementation
- Student insertion
- Student searching
- Inorder traversal
- Display students using BST

*Hash Table*
- Hash Node implementation
- Hash function
- Student insertion
- Student ID searching
- Student removal
- Collision handling using chaining

**Main.java Contribution:**

Member 3 integrated:
8. Display Students using BST
9. Search Student using Hashing

**Main.java Commit:**

```text
feat: integrate BST and hashing operations into Main
```

---

## Member 4 Contribution — ANM. Imthath

**Responsibility:** Graph implementation, campus locations, campus connections, and BFS traversal.

**Branch:** `member4-graph`

**Files:**
- `CampusGraph.java`

**Individual Contribution:**

Member 4 implemented:
- Graph using an Adjacency List
- Add campus location
- Remove campus location
- Add campus connection
- Remove campus connection
- Display campus connections
- Duplicate location validation
- Invalid location validation
- Breadth First Search traversal

**Main.java Contribution:**

Member 4 integrated:
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection/Road
13. Remove Campus Connection/Road
14. Display Campus Connections
15. Traverse Campus Locations using BFS

**Main.java Commit:**

```text
feat: integrate campus graph and BFS operations into Main
```

---

## Project Structure

```text
Student-Campus-Management-System
│
├── src
│   └── studentcampussystem
│       │
│       ├── Student.java
│       ├── StudentLinkedList.java
│       ├── ActionStack.java
│       ├── ServiceRequest.java
│       ├── ServiceQueue.java
│       ├── StudentBST.java
│       ├── StudentHashTable.java
│       ├── CampusGraph.java
│       └── Main.java
│
└── README.md
```

---

## Data Structures Used

| Data Structure | Purpose |
|---|---|
| Linked List | Store and manage student records |
| Stack | Maintain recent action history |
| Queue | Manage student service requests in FIFO order |
| Binary Search Tree | Organize and display student records |
| Hash Table | Search students efficiently using Student ID |
| Graph | Represent campus locations and connections |
| BFS | Traverse connected campus locations |

---

## Main Menu

The application provides the following menu:

```text
==============================================
 UNIVERSITY STUDENT RECORD AND CAMPUS ROUTE
              MANAGEMENT SYSTEM
==============================================

1.  Add Student Record
2.  Update Student Record
3.  Delete Student Record
4.  Display All Records using Linked List
5.  Add Service Request to Queue
6.  Process Next Service Request
7.  Display Recent Actions using Stack
8.  Display Students using BST
9.  Search Student using Hashing
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection/Road
13. Remove Campus Connection/Road
14. Display Campus Connections
15. Traverse Campus Locations using BFS
16. Exit
```

### Main.java Integration

The project uses one shared `Main.java` file.

| Member | Menu Cases | Responsibility |
|---|---|---|
| Member 1 (Leader) | 1 – 4 | Student Records and Linked List |
| Member 2 | 5 – 7 | Stack and Queue |
| Member 3 | 8 – 9 | BST and Hashing |
| Member 4 | 10 – 15 | Graph and BFS |
| Common | 16 | Exit |

---

## GitHub Branches

The following branches are used:

```text
main
Rimzath-linkedlist
Usama-stack-queue
Sujath-bst-hashing
Imthath-graph
```

Each member worked on their assigned branch before integration into the `main` branch.

## GitHub Collaboration

Git and GitHub were used for project version control and collaboration.

The collaboration process includes:

- Individual branches
- Meaningful commits
- Push operations
- Pull requests
- Code reviews
- Branch merging
- Main branch integration
- Testing
- Debugging
- Documentation

All members participated in integration, testing, debugging, and completion of the project. As team leader, Member 1 (ABM. Rimzath) oversaw the merging of branches into `main` and final integration.

---

## Sample Records

The following records can be used to test the application.

### Sample Student Records

| Student ID | Name | Programme | Marks |
|---|---|---|---|
| S001 | Ahmed Rizwan | BAIT | 78.5 |
| S002 | Fathima Nuzra | BAIT | 84.0 |
| S003 | Mohamed Irfan | BAIT | 69.5 |
| S004 | Ayesha Rahman | BAIT | 91.0 |
| S005 | Abdul Hakeem | BAIT | 73.0 |

### Sample Add Student

Input:

```text
Student ID: S001
Name: Ahmed Rizwan
Programme: BAIT
Marks: 78.5
```

Expected output:

```text
Student added successfully.
```

### Sample Student Display

```text
-------------------------
Student ID : S001
Name       : Ahmed Rizwan
Programme  : BAIT
Marks      : 78.5
```

### Sample Linked List Records

```text
S001 - Ahmed Rizwan - BAIT - 78.5
S002 - Fathima Nuzra - BAIT - 84.0
S003 - Mohamed Irfan - BAIT - 69.5
S004 - Ayesha Rahman - BAIT - 91.0
S005 - Abdul Hakeem - BAIT - 73.0
```

### Sample Student Update

Original record:

```text
Student ID : S003
Name       : Mohamed Irfan
Programme  : BAIT
Marks      : 69.5
```

Update input:

```text
Student ID: S003
New Name: Mohamed Irfan
New Programme: BAIT
New Marks: 76.0
```

Updated record:

```text
Student ID : S003
Name       : Mohamed Irfan
Programme  : BAIT
Marks      : 76.0
```

### Sample Student Delete

Input:

```text
Student ID: S005
```

Expected output:

```text
Student deleted successfully.
```

### Sample Service Requests

| Student ID | Service Request |
|---|---|
| S001 | Request student letter |
| S003 | Update contact details |
| S002 | Request academic transcript |
| S005 | Request ID card replacement |

Example Queue:

```text
S001 - Request student letter
S003 - Update contact details
S002 - Request academic transcript
S005 - Request ID card replacement
```

The Queue follows **First In → First Out (FIFO)**. Therefore, the first request processed is:

```text
S001 - Request student letter
```

### Sample Recent Actions

Example Stack (top first):

```text
Added student: S005
Updated student: S003
Processed request for S001
Added service request for S001
Added student: S004
```

The Stack follows **Last In → First Out (LIFO)**. Therefore, the most recent action appears first.

### Sample BST Records

Insert Student IDs in this order:

```text
S003, S001, S005, S002, S004
```

Possible BST:

```text
        S003
       /    \
    S001    S005
       \     /
      S002 S004
```

Expected inorder traversal:

```text
S001
S002
S003
S004
S005
```

### Sample Hash Search

Input:

```text
Enter Student ID: S003
```

Expected output:

```text
Student found:

Student ID : S003
Name       : Mohamed Irfan
Programme  : BAIT
Marks      : 69.5
```

Invalid search:

```text
Enter Student ID: S100
```

Expected output:

```text
Student not found.
```

### Sample Campus Locations

```text
Library
Laboratory
Cafeteria
Administration
Lecture Hall
```

### Sample Campus Connections

Add the following connections:

```text
Library        <-> Laboratory
Library        <-> Lecture Hall
Laboratory     <-> Cafeteria
Cafeteria      <-> Administration
Administration <-> Lecture Hall
```

Possible adjacency list:

```text
Library        -> [Laboratory, Lecture Hall]
Laboratory     -> [Library, Cafeteria]
Cafeteria      -> [Laboratory, Administration]
Administration -> [Cafeteria, Lecture Hall]
Lecture Hall   -> [Library, Administration]
```

### Sample BFS Traversal

Starting location: `Library`

Possible output:

```text
Library Laboratory Lecture Hall Cafeteria Administration
```

> The exact BFS order can depend on the order in which the campus connections were added.

---

## Input Validation

The system handles invalid situations including:

- Empty Student ID
- Duplicate Student ID
- Empty student name
- Empty programme
- Invalid marks (below 0 or above 100)
- Missing student records
- Empty service requests
- Empty campus location names
- Duplicate campus locations
- Missing campus locations
- Invalid campus connections
- Invalid menu input

---

## Testing

### Linked List Testing
- Add student
- Search student
- Update student
- Delete student
- Display students
- Duplicate Student ID handling

### Stack Testing
- Push action
- Pop action
- Display recent actions
- Empty Stack handling

### Queue Testing
- Enqueue service request
- Dequeue service request
- FIFO processing
- Empty Queue handling

### BST Testing
- Student insertion
- Student searching
- Inorder traversal
- Student record display

### Hash Table Testing
- Student insertion
- Student searching
- Student removal
- Hash collision handling

### Graph Testing
- Add campus location
- Remove campus location
- Add campus connection
- Remove campus connection
- Display campus connections
- BFS traversal
- Duplicate location handling
- Invalid location handling

---

## Technologies Used

- Java
- Visual Studio Code
- Git
- GitHub

## Requirements

- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack for Visual Studio Code
- Git

---

## How to Run the Project

**Step 1 – Clone the repository**

Open the VS Code terminal and run:

```bash
git clone https://github.com/mhdRimzath/Student-Campus-Management-System.git
```

**Step 2 – Open the project**

Open the cloned project folder in Visual Studio Code.

**Step 3 – Open Main.java**

Navigate to:

```text
src/studentcampussystem/Main.java
```

**Step 4 – Run the application**

Click **Run Java**, or select **Run > Run Without Debugging**.

**Step 5 – Use the console menu**

The application displays the main menu. Enter a number from **1 – 16** to select an operation.

---

## Individual Demonstration

Each member should be able to explain and demonstrate their own contribution.

| Member | Files | Demonstrate |
|---|---|---|
| Member 1 (Leader) | `Student.java`, `StudentLinkedList.java` | Student model, Linked List, add, search, update, delete, display records |
| Member 2 | `ActionStack.java`, `ServiceRequest.java`, `ServiceQueue.java` | Stack push/pop, recent actions, queue enqueue/dequeue, request processing |
| Member 3 | `StudentBST.java`, `StudentHashTable.java` | BST insertion/search/inorder traversal, hash insertion/search/removal |
| Member 4 | `CampusGraph.java` | Add/remove location, add/remove connection, display network, BFS traversal |

---

## Final Project Checklist

Before submission, verify that:

- [ ] The complete project is included.
- [ ] Linked List functionality is implemented.
- [ ] Stack functionality is implemented.
- [ ] Queue functionality is implemented.
- [ ] BST functionality is implemented.
- [ ] Hashing functionality is implemented.
- [ ] Graph functionality is implemented.
- [ ] BFS traversal is implemented.
- [ ] `Main.java` is fully integrated.
- [ ] All group member names are correct.
- [ ] All Student IDs are correct.
- [ ] Responsibilities are documented.
- [ ] Individual contributions are documented.
- [ ] GitHub branches are available.
- [ ] Commits are available.
- [ ] Pull requests are completed where applicable.
- [ ] `README.md` is complete.
- [ ] Demo video is complete.
- [ ] All members can explain their contribution.

---

## Conclusion

The University Student Record and Campus Route Management System demonstrates the practical implementation of multiple data structures within a single Java console application.

The project uses:

- Linked Lists for student record management
- Stacks for recent action history
- Queues for student service requests
- Binary Search Trees for student organization
- Hash Tables for efficient student searching
- Graphs for campus route representation
- BFS for campus traversal

Git and GitHub were used for branch-based team collaboration, meaningful commits, integration, testing, debugging, and documentation. As team leader, ABM. Rimzath coordinated the team's collaboration process and final submission.

---

repository-url: https://github.com/mhdRimzath/Student-Campus-Management-System.git