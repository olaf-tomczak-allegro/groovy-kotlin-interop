package org.example

import spock.lang.Specification
import spock.lang.Subject

class JustTestingGroovy4Spec extends Specification {

    @Subject
    def subject = new JustTesting(true, true, true, true, true)

    def "kotlin boolean property should work in groovy (non-null, no 'is')"() {
        expect:
        subject.nonNullNoPrefix == true
    }
    def "kotlin boolean property getter should work in groovy (non-null, no 'is')"() {
        expect:
        subject.getNonNullNoPrefix() == true
    }



    def "kotlin boolean property should work in groovy (non-null, starts with 'is', calling with 'is')"() {
        expect:
        subject.isNonNull == true
    }

    def "kotlin boolean property should work in groovy (non-null, starts with 'is', calling without 'is')"() {
        expect:
        subject.nonNull == true
    }

    def "kotlin boolean property getter should work in groovy (non-null, with 'is')"() {
        expect:
        subject.isNonNull() == true
    }



    def "kotlin boolean property should work in groovy (nullable, no 'is')"() {
        expect:
        subject.nullableNoPrefix == true
    }
    def "kotlin boolean property getter should work in groovy (nullable, no 'is')"() {
        expect:
        subject.getNullableNoPrefix() == true
    }



    def "kotlin boolean property should work in groovy (nullable, starts with 'is', calling with 'is')"() {
        expect:
        subject.isNullable == true
    }

    def "kotlin boolean property should work in groovy (nullable, starts with 'is', calling without 'is')"() {
        expect:
        subject.nullable == true
    }

    def "kotlin boolean property getter should work in groovy (nullable, with 'is')"() {
        expect:
        subject.isNullable() == true
    }

    def "kotlin boolean property should work in groovy (nullable, starts with 'is', calling without 'is', JVM name set)"() {
        expect:
        subject.nullableWithCustomGet == true
    }
}
