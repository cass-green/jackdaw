package com.github.vbauer.jackdaw

import com.github.vbauer.jackdaw.base.BaseTest
import org.hamcrest.Matchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * @author Vladislav Bauer
 */

class JClassDescriptorTest : BaseTest() {

    @Test
    fun testCompanyFactoryConstructor() {
        checkConstructor(CompanyClassDescriptor::class)
    }

    @Test
    fun testCompanyClassDescriptorFields() {
        assertThat(CompanyClassDescriptor.FIELD_ID, equalTo("id"))
        assertThat(CompanyClassDescriptor.FIELD_NAME, equalTo("name"))
        assertThat(CompanyClassDescriptor.FIELD_REVENUE, equalTo("revenue"))
        assertThat(CompanyClassDescriptor.FIELD_LISTED, equalTo("listed"))
        assertThat(CompanyClassDescriptor.FIELD_DESCRIPTIONS, equalTo("descriptions"))
        assertThat(CompanyClassDescriptor.FIELD_LLP, equalTo("llp"))
    }

    @Test
    fun testCompanyClassDescriptorMethods() {
        assertThat(CompanyClassDescriptor.METHOD_ID, equalTo("getId"))
        assertThat(CompanyClassDescriptor.METHOD_SET_ID, equalTo("setId"))
        assertThat(CompanyClassDescriptor.METHOD_NAME, equalTo("getName"))
        assertThat(CompanyClassDescriptor.METHOD_SET_NAME, equalTo("setName"))
        assertThat(CompanyClassDescriptor.METHOD_REVENUE, equalTo("getRevenue"))
        assertThat(CompanyClassDescriptor.METHOD_SET_REVENUE, equalTo("setRevenue"))
        assertThat(CompanyClassDescriptor.METHOD_LISTED, equalTo("isListed"))
        assertThat(CompanyClassDescriptor.METHOD_SET_LISTED, equalTo("setListed"))
        assertThat(CompanyClassDescriptor.METHOD_LISTED2, equalTo("isListed2"))
        assertThat(CompanyClassDescriptor.METHOD_DESCRIPTIONS, equalTo("getDescriptions"))
        assertThat(CompanyClassDescriptor.METHOD_SET_DESCRIPTIONS, equalTo("setDescriptions"))
    }

    @Test
    fun testAbstractMouseListenerClassDescriptorFields() {
        assertThat(AbstractMouseListenerClassDescriptor.FIELD_X, equalTo("x"))
        assertThat(AbstractMouseListenerClassDescriptor.FIELD_Y, equalTo("y"))
    }

    @Test
    fun testAbstractMouseListenerClassDescriptorMethods() {
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_TEST_MOUSE, equalTo("testMouse"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_X, equalTo("getX"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_Y, equalTo("getY"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_ON_CLICK, equalTo("onClick"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_ON_MOVE, equalTo("onMove"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_PRESS, equalTo("press"))
        assertThat(AbstractMouseListenerClassDescriptor.METHOD_PRESSED, equalTo("isPressed"))
    }

}
