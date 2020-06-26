# View util Extensions :fire: :fire:

Here we will have the following view extension

**1. [Installation](#installation).**</br>
**2. [Toast Usage](#toast-usage).**</br>
**3. [Snackbar Usage](#snackbar-usage).**</br>
**4. [Visibility Usage](#visibility-usage).**</br>

## Installation.
Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency to your app level build.gradle:

```gradle
dependencies {
	...
	implementation 'com.jnyakush.maktaba:viewutils:$latestVersion'
}
```

## Toast Usage
This is a sample working  with an Activity.

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Normal Toast  button click listener
        toast.setOnClickListener {
            toast("Hello world")
        }

        // Toast with string resource button listener
        toast_str.setOnClickListener {
            toastStr(R.string.app_name)
        }
    }
}
```

This is a sample working with Fragment.

```kotlin
class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Normal Toast  button click listener
        toast.setOnClickListener {
            context?.toast("Hello World")
        }
        
        // Toast with string resource button listener
        toast_str.setOnClickListener {
            context?.toastStr(R.string.app_name)
        }
    }
}
```


## Snackbar Usage

This is a sample working  with an Activity.

```kotlin
class Snackbar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        // How to handle normal snackbar
        normal_snackbar.setOnClickListener {
            layout_snackbar.snackbar("Hello World")
        }

        //How to handle snackbar with 
        action_snackbar.setOnClickListener {
            //.action(R.string.ok){}
            layout_snackbar.snackbar("Add Permissions").action("Ok"){
                toast("Action ok Clicked")
            }
        }
    }
}

```

This is a sample working with Fragment.

```kotlin
class Snackbar : Fragment(R.layout.fragment_snackbar) {
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        //normal snackbar 
        normal_snackbar.setOnClickListener {
            view.layout_snackbar.snackbar("Hello world")
        }
        
        //snackbar with action
        action_snackbar.setOnClickListener { 
            view.layout_snackbar.snackbar("Action Ok Clicked").action("ok"){
                context?.toast("Ok Clicked")
            }
        }
    }
}
```

## Visibility Usage

This is a sample working  with an Activity.

```kotlin
class Visibility : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visibility)
        
        //hiding stuff from view with Gone
        hide.setOnClickListener {
            text.hide()
        }
        
        //showing stuff that is gone or invisible
        show.setOnClickListener {
           text.show()
        }
    }
}
```

This is a sample working with Fragment.

```kotlin
class Visibility : Fragment(R.layout.fragment_visibility) {
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        //hiding stuff from view with Gone
        hide.setOnClickListener {
            text.hide()
        }

        //showing stuff that is gone or invisible
        show.setOnClickListener {
            text.show()
        }
    }

}
```


