# Quelle

... http://phpstyleguide.com/

# Introduction

There has certainly been plenty of fisty-cuffs about the recently released "standards" (PSR-1 and PSR-2) by the self-appointed PHP Framework Interoperability Group.

As an alternative (because everyone needs a little competition!) this style guide was created. All the included content has been agreed unanimously by all voting members. All content has been carefully researched so ensure that no-one codes this way. As no-one currently uses any of these techniques they are unbiased and impartial and therefore everyone can agree on these standards!
General rules

Code MUST use 5 spaces for indenting on Mac, 3 for Linux and 3.5 on Windows. This a applies to the developer not the file - so there will be various different indents as different developers on different operating systems work in the same file. This will help define accountability of code.

Lines lengths MUST have a hard limit of 857 characters because after all we are coding and not writing an essay on world peace.

All variable, constant, class, method and function names should follow the following naming conventions:
    Be EXACTLY 8 characters long.
    Names shorter than 8 characters long should be padded out with underscores. Eg. $vAr_____. This makes for pretty alignment and indentation.
    MUST conform to AlphA00nUM00Odd00EvEn formatting, where by every letter from A to Z is assigned a number, then if the number is odd it should be uppercase and if it is even it should be lowercase. Obviously spaces are represented by a double zero. Eg. 00

PHP keywords and functions MUST also follow AlphA00nUM00Odd00EvEn formatting but you'll just have to work around the ones with underscore in them. To comply with the strict standard all native PHP functions SHOULD be re-mapped to abide to the 8 characters length rule mentioned above - although this is probably asking to much.

There MUST be a blank line between every line of code unless lines are the same length. This is where the fixed length variables come in handy!

Comments MUST be right-aligned, using tabs, to improve readability.

Comments SHOULD be deliberately vague so that when code is updated the comments don't need to be - this saves valuable development time.

# Control structures

All arguments MUST must had an incremental number of spaces before. Eg. if there are 3 arguments - the first would have 1 space before, the second for have 2 and the third would have 3.

Following previous rules on blank lines - all control structures SHOULD have a blank line before the opening braces. Just to spice things up a bit, and to catch out a few novice coders, the closing braces MUST be directly after the final character of the body.

# Classes, methods and functions

All method and function arguments MUST comply to the same spacing rule as control structures - see above.

All classes, functions and methods MUST have a line of ///// after the opening braces to delimit the beginning of them. You're probably best off using the full 857 character limit just incase someone views it on a hi-res screen.

When making a method or function call, arguments SHOULD be put 2 to a line, so it sort of looks neater but it's actually quite hard to read. This ensures developers are always paying attention.

# Wildcards

The make sure all developers are kept on their toes and are paying full attention to their code, 1 of each of the following MUST be included in every PHP file:
    A line of code that sets a variable that is never used
    A while loop that creates an array that is never used
    An unused function or method
    4 smiley face emoticons :-). These are most important to keep developers happy whilst working because, as everybody knows, all work and no play makes [inset developer name] a dull boy/girl!

