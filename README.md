# 🧪 String Calculator Kata - Test Driven Development (TDD)

Welcome to the **String Calculator Kata**, a TDD-driven Java implementation completed as part of the **Incubyte Campus Placement Round**.

This project follows the classic kata introduced by [Roy Osherove](http://osherove.com/kata), showcasing **Test-Driven Development**, clean coding, and comprehensive JUnit testing.

---

## 📘 What is TDD?

**Test-Driven Development (TDD)** is a development technique where you:

1. ✍️ Write a failing test first  
2. 🛠️ Write the minimal code to make the test pass  
3. 🔄 Refactor the code while keeping tests green  

It follows this powerful cycle:

> 🔁 **Failed → Green → Refactor**

---

## 📐 How I Built This Project

This project was built incrementally, respecting TDD principles step-by-step:

- 🚦 Started with the **simplest test** for an empty string
- 🧪 Added tests one at a time for each new rule or requirement
- 🧹 Refactored after each passing test
- 💡 Never wrote unnecessary logic before the test demanded it

---

## ✅ Features Implemented

| Step | Requirement                                                                 | Status |
|------|-----------------------------------------------------------------------------|--------|
| 1️⃣  | Return `0` for empty string                                                 | ✅ Done |
| 2️⃣  | Handle 1 or 2 numbers `"1"`, `"1,2"`                                        | ✅ Done |
| 3️⃣  | Allow unknown number of numbers `"1,2,3,4"`                                 | ✅ Done |
| 4️⃣  | Support newline characters `"1\n2,3"`                                       | ✅ Done |
| 5️⃣  | Support custom single delimiter `"//;\n1;2"`                                | ✅ Done |
| 6️⃣  | Throw exception for negative numbers with message                          | ✅ Done |
| 7️⃣  | Show all negative numbers in exception message                             | ✅ Done |
| 8️⃣  | Track how many times `add()` was called via `getCalledCount()`             | ✅ Done |
| 9️⃣  | Ignore numbers >1000 (`"1,1001"` → returns 1)                              | ✅ Done |
| 🔟  | Support multi-char delimiters like `"//[***]\n1***2***3"`                    | ✅ Done |
| 1️⃣1️⃣ | Support multiple single-char delimiters like `"//[*][%]\n1*2%3"`         | ✅ Done |
| 1️⃣2️⃣ | Support multiple multi-char delimiters like `"//[**][%%]\n1**2%%3"`     | ✅ Done |

---

## 💡 Sample Inputs & Outputs

| Input                                | Output / Behavior                        |
|--------------------------------------|-------------------------------------------|
| `""`                                 | `0`                                       |
| `"1"`                                | `1`                                       |
| `"1,2"`                              | `3`                                       |
| `"1\n2,3"`                           | `6`                                       |
| `"//;\n1;2"`                         | `3`                                       |
| `"//[***]\n1***2***3"`               | `6`                                       |
| `"//[*][%]\n1*2%3"`                  | `6`                                       |
| `"//[**][%%]\n1**2%%3"`              | `6`                                       |
| `"1,-2,-3"`                          | Exception: `Negatives not allowed [-2, -3]` |
| `"1,1002"`                           | `1`                                       |

---

## 🧪 Testing

JUnit is used as the primary testing framework.

Test coverage includes:

- All edge cases
- Negative numbers
- Large numbers
- Delimiters (default, custom, multi-char, multiple)

> 🔍 All tests are located in `StringCalculatorTest.java`

To run tests:

```bash
mvn test
```

---

## 📁 Project Structure

```
Incubyte-Test/
├── src/
│   ├── main/java/org/example/
│   │   └── StringCalculator.java       ← Core calculator logic
│   └── test/java/org/example/
│       └── StringCalculatorTest.java   ← JUnit tests for the calculator
├── pom.xml                             ← Maven dependencies (JUnit)
└── README.md                           ← You're reading it!
```

---

## 🧱 Tech Stack

| Tool         | Description                              |
|--------------|------------------------------------------|
| ☕ Java       | Primary programming language             |
| 🧪 JUnit 4.13 | Unit testing framework                   |
| 🛠️ Maven      | Build automation & dependency management |

---

## 📸 All Tests Passing

You can view the test output by running:

```bash
mvn test
```

All scenarios from the kata are Green ✅

---

## Credits & Thanks

Thanks to **Roy Osherove** for the kata and **Incubyte** for the opportunity to explore TDD in real-world scenarios.

This was a great exercise in writing clean, modular, and testable code with a purpose.

With appreciation,  
**👨‍💻 Preet Ketankumar Brahmbhatt**

---

> “First make it work, then make it right, then make it fast.”  
> — Kent Beck, Father of TDD
