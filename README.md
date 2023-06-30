# groovy-kotlin-interop

Shows differences in handling Kotlin properties in:
* Groovy 3
* Groovy 4

## Running tests

```
./gradlew test
```

## Conclusions

#### Nullable boolean properties

Property name handling changed in Groovy4

```kotlin
// Kotlin

class JustTesting(
    val nonNullNoPrefix: Boolean,
    val isNonNull: Boolean,
    val nullableNoPrefix: Boolean?,
    val isNullable: Boolean?,
    @get:JvmName("getNullableWithCustomGet") val isNullableWithCustomGet: Boolean?
)

```

```groovy
// Groovy

def subject = new JustTesting(true, true, true, true, true)

subject.nullable              // works in Groovy3, fails in Groovy4 !
subject.isNullable            // works in Groovy3 & Groovy4
subject.isNullable()          // works in Groovy3 & Groovy4
subject.nullableWithCustomGet // works in Groovy3 & Groovy4
```

