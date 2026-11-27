Review Category - Questions

1. Naming conventions. Are variable and method names descriptive?
    - Method naming sense are vague.
    - Single-letter names are terrible.

2. Code formatting - Is the code properly organized?
    - It's properly organized, though I would've preferred a different {} blocking.
    - There are random blanks...
    - No comments.

3. Logical errors - Does the program behave according to requirements?
    - "add" only saves the name. Age and grade are printed but never saved.
    - Dupes are accepted. For instance, John is added twice. With No ID, there's nothing to tell them apart
    - "display" only displays the name, not the full record.

4. Input validation - Are invalid names, ages, and grades rejected?
    - "add" accepts empty names, goes to negatives and a grade over 100!
    - Nothing checks for nulls.

5. Exception handling - Are unexpected errors handled?
    - There are no exception handling...

6. Duplicate code - Can repeated operations be simplified?
    - Two "add" John's, no dupe check.
    - Another operation that can be simplified are the Sys.out.print

7. Security - Is user input handled safely?
    - No, student should be in private.
    - There aren't any exploitables yet, no database, etc.
    - Input validation later could be good.

8. Maintainability - Can the program be easily modified?
    - Hard to reuse if everything's in static.
    - Printing inside add could be a problem later. Mixes logic.
    - No tests.
