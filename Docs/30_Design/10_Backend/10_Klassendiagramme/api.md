# API Function Documentation

## Using the API

Start the API with `init` to analyse the path.
```php
API::init();

// Define your variables and routes here

API::finalize();
```
Use `finalize` to send 404 errors.

## Defining Variables

It is possible to define variables with the static `define` function.
The `define` function takes a regular expression and a name for the variable. Variable names are written in capital letters.
```php
API::define('\d+', 'NUMBER');
```

Variables in the path are written in curly braches. Use the variables in the routes like this...
```php
API::get('route/{NUMBER}/', function($a_Data) {
	// get variable content
	$a_Data['number'];
});
```

## Request method route functions

The API supports the following request methods:
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
The data array contains POST, PUT and DELETE data. It also contains the variables used in the route. There are also spacial indices set by the api.
The `path` index returns the path requested by the user. The `method` index contains the request method.
```php
$a_Data['path'];
$a_Data['method'];
```

When the route uses the `{AUTH}` variable the `session` index contains the current user session of type `Session`.
```php
$a_Data['session'];
```