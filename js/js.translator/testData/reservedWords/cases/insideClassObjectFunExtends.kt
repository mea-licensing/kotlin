package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    companion object {
        fun extends() { extends() }

        fun test() {
            testNotRenamed("extends", { extends() })
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}