
# RoastyToasty


## Prerequisites

Add this in your root `build.gradle` file (not your module `build.gradle` file):

```bash
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```bash
dependencies {
	        implementation 'com.github.aniketjain8441:RoastyToasty:1.0.1'
	}
```

## Usage

To display an normal Toast:
```
Toasty.normal(context, "Normal Toast");
```

To display an success Toast:
```
Toasty.success(context, "Success Toast");
```

To display an error Toast:
```
Toasty.success(context, "Error Toast");
```

To display an warning Toast:
```
Toasty.success(context, "Warning Toast");
```

## Custom Toast

To display the custom Toast:

### There is many ways to write a custom Toast, use anyone of them to create a custom Toast.

> #### Way 1:
```
Toasty.custom(Context context, String message)
```
> #### Example 1:
```
Toasty.custom(context, "Custom Toast");
```

> #### Way 2:
```
Toasty.custom(Context context, String message, int textSize)
```
> #### Example 2:
```
Toasty.custom(context, "Custom Toast", 18);
```

> #### Way 3:
```
Toasty.custom(Context context, String message, int gravity, int duration)
```
> #### Example 3:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
```

> #### Way 4:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor)
```
> #### Example 4:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300");
```

> #### Way 5:
```
Toasty.custom(Context context, String message, int duration, int drawable, String backgroundColor)
```
> #### Example 5:
```
Toasty.custom(context, "Custom Toast", Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300");
```

> #### Way 6:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor)
```
> #### Example 6:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300");
```

> #### Way 7:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 7:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 8:
```
Toasty.custom(Context context, String message, int duration, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 8:
```
Toasty.custom(context, "Custom Toast", Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 9:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor)
```
> #### Example 9:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9");
```

> #### Way 10:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int toastyWidth, int toastyHeight)
```
> #### Example 10:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 200, 200);
```

> #### Way 11:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int toastyWidth, int toastyHeight)
```
> #### Example 11:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 200, 200);
```

> #### Way 12:
```
Toasty.custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight)
```
> #### Example 12:
```
Toasty.custom(context, "Custom Toast", R.drawable.icon, "#ff3300", 19, "#f9f9f9", 200, 200);
```

> #### Way 13:
```
Toasty.custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight)
```
> #### Example 13:
```
Toasty.custom(context, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.icon, "#ff3300", 19, "#f9f9f9", 200, 200);
```

## Contributing

Please fork this repository and contribute back. Any contributions, large or small, major or minor features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed.
#### Thank you.


## Authors

- [@aniketjain8441](https://github.com/aniketjain8441/)

## Buy me a Coffee

- [Aniket Jain](https://www.buymeacoffee.com/aniketjain/)

