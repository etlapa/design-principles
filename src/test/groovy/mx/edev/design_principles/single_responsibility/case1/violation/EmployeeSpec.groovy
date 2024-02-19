package mx.edev.design_principles.single_responsibility.case1.violation

import spock.lang.Specification

class EmployeeSpec extends Specification{
    def fixture
    def "validate not null"() {
        when:
        fixture = new Employee("Employee",9999);
        then:
        fixture!=null
    }
}