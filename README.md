
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
