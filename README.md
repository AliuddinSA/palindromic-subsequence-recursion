# palindromic-subsequence-recursion
Recursive approach to solve Longest Palindromic Subsequence problem with time complexity analysis

# Longest Palindromic Subsequence (Recursive Solution)

## 📌 Problem
Given a string, find the length of the longest palindromic subsequence.

A subsequence keeps order but allows skipping characters.

---

## 💡 Approach

We use recursion with two pointers:

- `i` starts from the beginning
- `j` starts from the end

### Case 1: Characters match
We include both characters:


### Case 2: Characters do not match
We try both options:
---

## ⏱ Time Complexity
O(2ⁿ) in worst case due to exponential recursion (two choices at each step).

---

## 💾 Space Complexity
O(n) due to recursion stack depth.

---

## ⚡ Note
This is a brute-force recursive solution. It can be optimized using Dynamic Programming (Memoization) to reduce time complexity to O(n²).
