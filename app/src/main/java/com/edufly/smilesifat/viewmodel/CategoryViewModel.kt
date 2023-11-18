package com.edufly.smilesifat.viewmodel

import com.edufly.smilesifat.model.TabItem

fun CategoryViewModel() : MutableList<TabItem> {
    val tabList = mutableListOf<TabItem>()

    tabList.add(TabItem( "All Courses"))
    tabList.add(TabItem( "Science"))
    tabList.add(TabItem( "Commerce"))
    tabList.add(TabItem( "Arts"))
    tabList.add(TabItem( "CSE"))
    tabList.add(TabItem( "ECE"))
    tabList.add(TabItem( "EEE"))
    tabList.add(TabItem( "ME"))
    tabList.add(TabItem( "ESE"))
    tabList.add(TabItem( "BSE"))

    return tabList
}