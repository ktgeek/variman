/*
 * Created on Aug 21, 2003
 *
 */
package org.realtors.rets.server.webapp.cct;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.realtors.rets.server.Util;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

/**
 * @author kgarner
 */
public class RegistrationForm extends ValidatorActionForm
{
    /**
     *
     * @return
     */
    public String getAgentId()
    {
        return mAgentId;
    }

    /**
     *
     * @return
     */
    public String getCompany()
    {
        return mCompany;
    }

    /**
     *
     * @return
     */
    public String getEmail()
    {
        return mEmail;
    }

    /**
     *
     * @return
     */
    public String getFirstName()
    {
        return mFirstName;
    }

    /**
     *
     * @return
     */
    public String getLastName()
    {
        return mLastName;
    }

    /**
     *
     * @return
     */
    public String getPassword()
    {
        return mPassword;
    }

    /**
     *
     * @return
     */
    public String getProductName()
    {
        return mProductName;
    }

    /**
     *
     * @return
     */
    public String getProductVersion()
    {
        return mProductVersion;
    }

    /**
     *
     * @return
     */
    public String getUserAgent()
    {
        return mUserAgent;
    }

    /**
     *
     * @return
     */
    public String getUsername()
    {
        return mUsername;
    }

    /**
     *
     * @return
     */
    public String getVerifyPassword()
    {
        return mVerifyPassword;
    }
    /**
     *
     * @return
     */
    public boolean isAcceptedLegalese()
    {
        return mAcceptedLegalese;
    }

    /* (non-Javadoc)
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request)
    {
        mAgentId = "";
        mCompany = "";
        mEmail = "";
        mFirstName = "";
        mLastName = "";
        mPassword = "";
        mProductName = "";
        mProductVersion = "";
        mUserAgent = "";
        mUsername = "";
        mVerifyPassword = "";
    }

    /**
     *
     * @param b
     */
    public void setAcceptedLegalese(boolean b)
    {
        mAcceptedLegalese = b;
    }

    /**
     *
     * @param string
     */
    public void setAgentId(String string)
    {
        mAgentId = string;
    }

    /**
     *
     * @param string
     */
    public void setCompany(String string)
    {
        mCompany = string;
    }

    /**
     *
     * @param string
     */
    public void setEmail(String string)
    {
        mEmail = string;
    }

    /**
     *
     * @param string
     */
    public void setFirstName(String string)
    {
        mFirstName = string;
    }

    /**
     *
     * @param string
     */
    public void setLastName(String string)
    {
        mLastName = string;
    }

    /**
     *
     * @param string
     */
    public void setPassword(String string)
    {
        mPassword = string;
    }

    /**
     *
     * @param string
     */
    public void setProductName(String string)
    {
        mProductName = string;
    }

    /**
     *
     * @param string
     */
    public void setProductVersion(String string)
    {
        mProductVersion = string;
    }

    /**
     *
     * @param string
     */
    public void setUserAgent(String string)
    {
        mUserAgent = string;
    }

    /**
     *
     * @param string
     */
    public void setUsername(String string)
    {
        mUsername = string;
    }

    /**
     *
     * @param string
     */
    public void setVerifyPassword(String string)
    {
        mVerifyPassword = string;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return new ToStringBuilder(this, Util.SHORT_STYLE)
            .append("username", mUserAgent)
            .append("firstName", mFirstName)
            .append("lastName", mLastName)
            .append("company", mCompany)
            .append("email", mEmail)
            .append("userAgent", mUserAgent)
            .append("acceptedLegalese", mAcceptedLegalese)
            .toString();
    }

    private boolean mAcceptedLegalese;
    private String mAgentId;
    private String mCompany;
    private String mEmail;
    private String mFirstName;
    private String mLastName;
    private String mPassword;
    private String mProductName;
    private String mProductVersion;
    private String mUserAgent;
    private String mUsername;
    private String mVerifyPassword;
}
