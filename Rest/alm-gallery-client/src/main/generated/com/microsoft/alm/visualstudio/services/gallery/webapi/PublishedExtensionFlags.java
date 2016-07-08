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


/** 
 */
public enum PublishedExtensionFlags {

    /**
    * No flags exist for this extension.
    */
    NONE(0),
    /**
    * The Disabled flag for an extension means the extension can&amp;#039;t be changed and won&amp;#039;t be used by consumers. The disabled flag is managed by the service and can&amp;#039;t be supplied by the Extension Developers.
    */
    DISABLED(1),
    /**
    * BuiltIn Extension are available to all Tenants. An explicit registration is not required. This attribute is reserved and can&amp;#039;t be supplied by Extension Developers.  BuiltIn extensions are by definition Public. There is no need to set the public flag for extensions marked BuiltIn.
    */
    BUILT_IN(2),
    /**
    * This extension has been validated by the service. The extension meets the requirements specified. This attribute is reserved and can&amp;#039;t be supplied by the Extension Developers. Validation is a process that ensures that all contributions are well formed. They meet the requirements defined by the contribution type they are extending. Note this attribute will be updated asynchronously as the extension is validated by the developer of the contribution type. There will be restricted access to the extension while this process is performed.
    */
    VALIDATED(4),
    /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can&amp;#039;t be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
    TRUSTED(8),
    /**
    * The Paid flag indicates that the commerce can be enabled for this extension. Publisher needs to setup Offer/Pricing plan in Azure. If Paid flag is set and a corresponding Offer is not available, the extension will automatically be marked as Preview. If the publisher intends to make the extension Paid in the future, it is mandatory to set the Preview flag. This is currently available only for VSTS extensions only.
    */
    PAID(16),
    /**
    * This extension registration is public, making its visibilty open to the public. This means all tenants have the ability to install this extension. Without this flag the extension will be private and will need to be shared with the tenants that can install it.
    */
    PUBLIC(256),
    /**
    * This extension has multiple versions active at one time and version discovery should be done usig the defined &amp;quot;Version Discovery&amp;quot; protocol to determine the version available to a specific user or tenant.  &amp;#064;TODO: Link to Version Discovery Protocol.
    */
    MULTI_VERSION(512),
    /**
    * The system flag is reserved, and cant be used by publishers.
    */
    SYSTEM(1024),
    /**
    * The Preview flag indicates that the extension is still under preview (not yet of &amp;quot;release&amp;quot; quality). These extensions may be decorated differently in the gallery and may have different policies applied to them.
    */
    PREVIEW(2048),
    ;

    private int value;

    private PublishedExtensionFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        if (name.equals("BUILT_IN")) { //$NON-NLS-1$
            return "builtIn"; //$NON-NLS-1$
        }

        if (name.equals("VALIDATED")) { //$NON-NLS-1$
            return "validated"; //$NON-NLS-1$
        }

        if (name.equals("TRUSTED")) { //$NON-NLS-1$
            return "trusted"; //$NON-NLS-1$
        }

        if (name.equals("PAID")) { //$NON-NLS-1$
            return "paid"; //$NON-NLS-1$
        }

        if (name.equals("PUBLIC")) { //$NON-NLS-1$
            return "public"; //$NON-NLS-1$
        }

        if (name.equals("MULTI_VERSION")) { //$NON-NLS-1$
            return "multiVersion"; //$NON-NLS-1$
        }

        if (name.equals("SYSTEM")) { //$NON-NLS-1$
            return "system"; //$NON-NLS-1$
        }

        if (name.equals("PREVIEW")) { //$NON-NLS-1$
            return "preview"; //$NON-NLS-1$
        }

        return null;
    }
}
