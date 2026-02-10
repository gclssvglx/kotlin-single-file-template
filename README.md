# A Kotlin One-Pager Template for IntelliJ IDEA

A Kotlin one-pager with a sample function and tests for use with IntelliJ IDEA. Based on the collection of [Rails Contribution](https://github.com/rails/rails/tree/main/guides/bug_report_templates) files.

Great for quick ideas, testing theories, examples etc.

## How does it work?

Essentially, it adds this to the `build.gradle.kts` file...

```kotlin
dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
```

And creates this file `src/main/kotlin/Template.kt` containing...

```kotlin
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

fun sumTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

class SumTwoNumbersTest {
    @Test
    fun `test sum adds two numbers`() {
        val result = sumTwoNumbers(10, 5)
        assertEquals(15, result)
    }
}
```

## How to use it?

1. Click on the `Use this template` button and select `Create a new repository`
1. Give your repository a name, owner (unless already selected) and change the visibility as you need
1. Click `Create repository`
1. Clone the new repository via `git clone <repo-name>`
1. Open IntelliJ IDEA and `Open` the cloned repository
1. Open `src/main/kotlin/Template.kt`

IntelliJ will automatically detect the runnable tests in `src/main/kotlin/Template.kt` and allow you to run them by clicking on the green `Run` arrow in the sidebar.

Once you tested it's working - change the code and tests.
