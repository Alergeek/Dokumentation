# Source
https://google-styleguide.googlecode.com/svn/trunk/javascriptguide.xml

# JavaScript Language Rules
## var
Declarations with var: Always
## Constants
    Use NAMES_LIKE_THIS for constant values.
    Use @const to indicate a constant (non-overwritable) pointer (a variable or property).
    Never use the const keyword as it's not supported in Internet Explorer.

## Semicolons
 Always use semicolons.
## Nested functions
Yes
## Function Declarations Within Blocks
No
## Exceptions
Yes
## Custom exceptions
▶
Yes
## Standards features
▶
Always preferred over non-standards features
## Wrapper objects for primitive types
▶
No
## Multi-level prototype hierarchies
▶
Not preferred
## Method and property definitions
▶
/** @constructor */ function SomeConstructor() { this.someProperty = 1; } Foo.prototype.someMethod = function() { ... };
## delete
▶
Prefer this.foo = null.
## Closures
▶
Yes, but be careful.
## eval()
▶
Only for code loaders and REPL (Read–eval–print loop)
## with() {}
▶
No
## this
▶
Only in object constructors, methods, and in setting up closures
## for-in loop
▶
Only for iterating over keys in an object/map/hash
## Associative Arrays
▶
Never use Array as a map/hash/associative array
## Multiline string literals
▶
No
## Array and Object literals
▶
Yes
## Modifying prototypes of builtin objects
▶
No
## Internet Explorer's Conditional Comments
▶
No
# JavaScript Style Rules
## Naming
▶
In general, use functionNamesLikeThis, variableNamesLikeThis, ClassNamesLikeThis, EnumNamesLikeThis, methodNamesLikeThis, CONSTANT_VALUES_LIKE_THIS, foo.namespaceNamesLikeThis.bar, and filenameslikethis.js.
## Custom toString() methods
▶
Must always succeed without side effects.
## Deferred initialization
▶
OK
## Explicit scope
▶
Always
## Code formatting
▶
Expand for more information.
## Parentheses
▶
Only where required
## Strings
▶
Prefer ' over "
## Visibility (private and protected fields)
▶
Encouraged, use JSDoc annotations @private and @protected
## JavaScript Types
▶
Encouraged and enforced by the compiler.
## Comments
▶
Use JSDoc
## Providing Dependencies With goog.provide
▶
Only provide top-level symbols.
## Compiling
▶
Required
## Tips and Tricks
▶
JavaScript tidbits