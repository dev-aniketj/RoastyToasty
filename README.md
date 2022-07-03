
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

### `There is many ways to write a custom Toast`

> #### Method 1:
```
custom(Context context, String message)
```
> #### Example 1:
```
Toasty.custom(context, "Custom Toast");
```
