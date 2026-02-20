# VUPay

Java application for Victoria University Kampala module lookup and tuition display.

## Project Details
- **Project Name:** VUPay
- **Class Name:** VUCourses
- **Language:** Java

## Module Codes and Tuition
| Module | ModuleCode | Tuition (UGX) |
|---|---|---:|
| BSc. Software Engineering | BSF | 900,000 |
| BSc. Information Technology | BIT | 750,000 |
| BSc. Computer Science | BCS | 800,000 |
| BSc. Computer Engineering | BCE | 950,000 |

## Program Behavior
The program prompts the applicant to enter a module code:
- Valid codes: `BSF`, `BIT`, `BCS`, `BCE`
- For a valid code, it displays:
  - Module name
  - Module code
  - Tuition
- For an invalid code, it displays:
  - `Wrong Module Code details`

## Source File
- `src/VUCourses.java`

## How to Compile and Run
From the project root (`VUPay`):

```powershell
cd src
javac VUCourses.java
java VUCourses
```

Then enter one of the valid module codes when prompted.

## Example
Input:

```text
BSF
```

Output:

```text
Module: BSc. Software Engineering
ModuleCode: BSF
Tuition: 900,000
```

## Repository
GitHub: https://github.com/priscillaKE/QTN2-VUpay.git
