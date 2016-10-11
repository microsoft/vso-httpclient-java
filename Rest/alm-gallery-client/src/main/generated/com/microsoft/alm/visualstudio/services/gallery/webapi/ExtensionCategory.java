// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.gallery.webapi;

import java.util.ArrayList;

/** 
 */
public class ExtensionCategory {

    /**
    * The name of the products with which this category is associated to.
    */
    private ArrayList<String> associatedProducts;
    private int categoryId;
    /**
    * This is the internal name for a category
    */
    private String categoryName;
    /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
    private String language;
    /**
    * The list of all the titles of this category in various languages
    */
    private ArrayList<CategoryLanguageTitle> languageTitles;
    /**
    * This is the internal name of the parent if this is associated with a parent
    */
    private String parentCategoryName;

    /**
    * The name of the products with which this category is associated to.
    */
    public ArrayList<String> getAssociatedProducts() {
        return associatedProducts;
    }

    /**
    * The name of the products with which this category is associated to.
    */
    public void setAssociatedProducts(final ArrayList<String> associatedProducts) {
        this.associatedProducts = associatedProducts;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(final int categoryId) {
        this.categoryId = categoryId;
    }

    /**
    * This is the internal name for a category
    */
    public String getCategoryName() {
        return categoryName;
    }

    /**
    * This is the internal name for a category
    */
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
    public String getLanguage() {
        return language;
    }

    /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
    * The list of all the titles of this category in various languages
    */
    public ArrayList<CategoryLanguageTitle> getLanguageTitles() {
        return languageTitles;
    }

    /**
    * The list of all the titles of this category in various languages
    */
    public void setLanguageTitles(final ArrayList<CategoryLanguageTitle> languageTitles) {
        this.languageTitles = languageTitles;
    }

    /**
    * This is the internal name of the parent if this is associated with a parent
    */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
    * This is the internal name of the parent if this is associated with a parent
    */
    public void setParentCategoryName(final String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }
}
