# API Function Documentation

## Using the API

Start the API to analyse the path.
```php
API::init();

// Define your variables and routes here

API::finalize();
```
Use `finalize` to send 404 errors.

## Defining Variables

It is possible to define variables with the static `define` function.
The `define` function takes a regular expression and a name for the variable.
```php
API::define('\d+', '{NUMBER}');
```

Use the variables in the routes like this...
```php
API::get('route/{NUMBER}/', function($a_Data) {
	// get variable content
	$a_Data['number'];
});
```

## Request method route functions

The API supports the following request Methods:
`GET`, `POST`, `PUT` and `DELETE`.

The Routes are defined with the corresponding static methods in lower cases:
```php
API::get('route/', function($a_Data) {
	// execute code here
});
API::post('route/', function() {});
API::put('route/', function() {});
API::delete('route/', function() {});
```

## Special data in the array
When the route uses the `{AUTH}` variable the `session` index contains the current user session from Type `Session`.
```php
$a_Data['session'];
```