package org.realtors.rets.server.metadata;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @hibernate.class table="rets_metadata_resource"
 */
public class Resource implements Serializable
{
    public Resource(long id)
    {
        mId = new Long(id);
    }

    public Resource()
    {
        mId = null;
    }

    /**
     *
     * @return a Long object
     *
     * @hibernate.id generator-class="native"
     */
    public Long getId()
    {
        return mId;
    }

    public void setId(Long id)
    {
        mId = id;
    }

    /**
     *
     * @return a String
     *
     * @hibernate.property
     * @hibernate.column name="resourceID"
     *   not-null="true"
     *   unique="true"
     *   index="resource_rets_id_index"
     *   length="32"
     */
    public String getResourceID()
    {
        return mResourceID;
    }

    public void setResourceID(String resourceID)
    {
        mResourceID = resourceID;
    }

    /**
     *
     * @return a ResourceStandardNameEnum
     *
     * @hibernate.property
     * @hibernate.column name="standardName"
     *   not-null="false"
     *   unique="false"
     *   index="resource_standard_name_index"
     */
    public ResourceStandardNameEnum getStandardName()
    {
        return mStandardName;
    }

    public void setStandardName(ResourceStandardNameEnum standardName)
    {
        mStandardName = standardName;
    }

    /**
     *
     * @return a String
     *
     * @hibernate.property length="32"
     */
    public String getVisibleName()
    {
        return mVisibleName;
    }

    public void setVisibleName(String visibleName)
    {
        mVisibleName = visibleName;
    }

    /**
     *
     * @return a String
     *
     * @hibernate.property length="64"
     */
    public String getDescription()
    {
        return mDescription;
    }

    public void setDescription(String description)
    {
        mDescription = description;
    }

    /**
     *
     * @return a String
     *
     * @hibernate.property length="32"
     */
    public String getKeyField()
    {
        return mKeyField;
    }

    public void setKeyField(String keyField)
    {
        mKeyField = keyField;
    }

    /**
     *
     * @return a MSystem object
     *
     * @hibernate.many-to-one
     */
    public MSystem getSystemid()
    {
        return mSystemid;
    }

    public void setSystemid(MSystem systemid)
    {
        mSystemid = systemid;
    }

    /**
     *
     * @return a Set of MClass objects
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.MClass"
     */
    public Set getClasses()
    {
        return mClasses;
    }

    public void setClasses(Set classes)
    {
        mClasses = classes;
    }

    /**
     *
     * @return a Set of MObject objects
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.MObject"
     */
    public Set getObjects()
    {
        return mObjects;
    }

    public void setObjects(Set objects)
    {
        mObjects = objects;
    }

    /**
     *
     * @return a Set of SearchHelp objects
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.SearchHelp"
     */
    public Set getSearchHelps()
    {
        return mSearchHelps;
    }

    public void setSearchHelps(Set searchHelps)
    {
        mSearchHelps = searchHelps;
    }

    /**
     *
     * @return a Set of EditMasks
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.EditMask"
     */
    public Set getEditMasks()
    {
        return mEditMasks;
    }

    public void setEditMasks(Set editMasks)
    {
        mEditMasks = editMasks;
    }

    /**
     *
     * @return a Set of Lookup objects
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.Lookup"
     */
    public Set getLookups()
    {
        return mLookups;
    }

    public void setLookups(Set lookups)
    {
        mLookups = lookups;
    }

    /**
     *
     * @return a Set of ValidationLookups
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.ValidationLookup"
     */
    public Set getValidationLookups()
    {
        return mValidationLookups;
    }

    public void setValidationLookups(Set validationLookups)
    {
        mValidationLookups = validationLookups;
    }

    /**
     *
     * @return a Set of ValidationExternals
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.ValidationExternal"
     */
    public Set getValidationExternals()
    {
        return mValidationExternals;
    }

    public void setValidationExternals(Set validationExternals)
    {
        mValidationExternals = validationExternals;
    }

    /**
     *
     * @return a Set of ValidationExpressions
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.ValidationExpression"
     */
    public Set getValidationExpressions()
    {
        return mValidationExpressions;
    }

    public void setValidationExpressions(Set validationExpressions)
    {
        mValidationExpressions = validationExpressions;
    }

    /**
     *
     * @return a Set of UpdateHelp objects
     *
     * @hibernate.set inverse="true"
     * @hibernate.collection-key column="resourceid"
     * @hibernate.collection-one-to-many
     *   class="org.realtors.rets.server.metadata.UpdateHelp"
     */
    public Set getUpdateHelps()
    {
        return mUpdateHelps;
    }

    public void setUpdateHelps(Set updateHelps)
    {
        mUpdateHelps = updateHelps;
    }

    /**
     * Returns the path to the metadata object.  Similar to how the
     * RETS Client does it.
     *
     * @return a string with the path.
     */
    public String getPath()
    {
        String systemId = mSystemid.getPath();
        if (StringUtils.isEmpty(systemId))
        {
            return mResourceID;
        }
        else
        {
            return systemId + ":" + mResourceID;
        }
    }

    public String toString()
    {
        return mResourceID;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof Resource)) return false;
        Resource castOther = (Resource) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }

    public int hashCode()
    {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }

    /** identifier field */
    private Long mId;

    /** nullable persistent field */
    private String mResourceID;

    /** nullable persistent field */
    private ResourceStandardNameEnum mStandardName;

    /** nullable persistent field */
    private String mVisibleName;

    /** nullable persistent field */
    private String mDescription;

    /** nullable persistent field */
    private String mKeyField;

    /** nullable persistent field */
    private MSystem mSystemid;

    /** persistent field */
    private Set mClasses;

    /** persistent field */
    private Set mObjects;

    /** persistent field */
    private Set mSearchHelps;

    /** persistent field */
    private Set mEditMasks;

    /** persistent field */
    private Set mLookups;

    /** persistent field */
    private Set mValidationLookups;

    /** persistent field */
    private Set mValidationExternals;

    /** persistent field */
    private Set mValidationExpressions;

    /** persistent field */
    private Set mUpdateHelps;
}
