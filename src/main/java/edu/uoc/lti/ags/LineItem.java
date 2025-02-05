// Generated by delombok at Fri Jul 14 17:42:49 CEST 2023
package edu.uoc.lti.ags;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Created by xaracil@uoc.edu
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineItem {
	/**
	 * URL end point for the resource. It must be present on all responses containing the resource and may be used for subsequent operations on that resource.
	 */
	private String id;
	/**
	 */
	private double scoreMaximum;
	/**
	 * label to use in the Tool Consumer UI (Gradebook)
	 */
	private String label;
	/**
	 * Additional information about the line item; may be used by the tool to identify line items attached to the same resource or resource link (example: grade, originality, participation)
	 */
	private String tag;
	/**
	 * Tool resource identifier for which this line item is receiving scores from
	 */
	private String resourceId;
	/**
	 * Id of the tool platform's resource link to which this line item is attached to
	 */
	private String resourceLinkId;
	/**
	 * Submission information
	 */
	private Submission submission;

	/**
	 * URL end point for the resource. It must be present on all responses containing the resource and may be used for subsequent operations on that resource.
	 */
	@java.lang.SuppressWarnings("all")
	public String getId() {
		return this.id;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public double getScoreMaximum() {
		return this.scoreMaximum;
	}

	/**
	 * label to use in the Tool Consumer UI (Gradebook)
	 */
	@java.lang.SuppressWarnings("all")
	public String getLabel() {
		return this.label;
	}

	/**
	 * Additional information about the line item; may be used by the tool to identify line items attached to the same resource or resource link (example: grade, originality, participation)
	 */
	@java.lang.SuppressWarnings("all")
	public String getTag() {
		return this.tag;
	}

	/**
	 * Tool resource identifier for which this line item is receiving scores from
	 */
	@java.lang.SuppressWarnings("all")
	public String getResourceId() {
		return this.resourceId;
	}

	/**
	 * Id of the tool platform's resource link to which this line item is attached to
	 */
	@java.lang.SuppressWarnings("all")
	public String getResourceLinkId() {
		return this.resourceLinkId;
	}

	/**
	 * Submission information
	 */
	@java.lang.SuppressWarnings("all")
	public Submission getSubmission() {
		return this.submission;
	}

	/**
	 * URL end point for the resource. It must be present on all responses containing the resource and may be used for subsequent operations on that resource.
	 */
	@java.lang.SuppressWarnings("all")
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public void setScoreMaximum(final double scoreMaximum) {
		this.scoreMaximum = scoreMaximum;
	}

	/**
	 * label to use in the Tool Consumer UI (Gradebook)
	 */
	@java.lang.SuppressWarnings("all")
	public void setLabel(final String label) {
		if (label == null) {
			throw new java.lang.NullPointerException("label is marked non-null but is null");
		}
		this.label = label;
	}

	/**
	 * Additional information about the line item; may be used by the tool to identify line items attached to the same resource or resource link (example: grade, originality, participation)
	 */
	@java.lang.SuppressWarnings("all")
	public void setTag(final String tag) {
		this.tag = tag;
	}

	/**
	 * Tool resource identifier for which this line item is receiving scores from
	 */
	@java.lang.SuppressWarnings("all")
	public void setResourceId(final String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * Id of the tool platform's resource link to which this line item is attached to
	 */
	@java.lang.SuppressWarnings("all")
	public void setResourceLinkId(final String resourceLinkId) {
		this.resourceLinkId = resourceLinkId;
	}

	/**
	 * Submission information
	 */
	@java.lang.SuppressWarnings("all")
	public void setSubmission(final Submission submission) {
		this.submission = submission;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof LineItem)) return false;
		final LineItem other = (LineItem) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (java.lang.Double.compare(this.getScoreMaximum(), other.getScoreMaximum()) != 0) return false;
		final java.lang.Object this$id = this.getId();
		final java.lang.Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final java.lang.Object this$label = this.getLabel();
		final java.lang.Object other$label = other.getLabel();
		if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
		final java.lang.Object this$tag = this.getTag();
		final java.lang.Object other$tag = other.getTag();
		if (this$tag == null ? other$tag != null : !this$tag.equals(other$tag)) return false;
		final java.lang.Object this$resourceId = this.getResourceId();
		final java.lang.Object other$resourceId = other.getResourceId();
		if (this$resourceId == null ? other$resourceId != null : !this$resourceId.equals(other$resourceId)) return false;
		final java.lang.Object this$resourceLinkId = this.getResourceLinkId();
		final java.lang.Object other$resourceLinkId = other.getResourceLinkId();
		if (this$resourceLinkId == null ? other$resourceLinkId != null : !this$resourceLinkId.equals(other$resourceLinkId)) return false;
		final java.lang.Object this$submission = this.getSubmission();
		final java.lang.Object other$submission = other.getSubmission();
		if (this$submission == null ? other$submission != null : !this$submission.equals(other$submission)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof LineItem;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final long $scoreMaximum = java.lang.Double.doubleToLongBits(this.getScoreMaximum());
		result = result * PRIME + (int) ($scoreMaximum >>> 32 ^ $scoreMaximum);
		final java.lang.Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final java.lang.Object $label = this.getLabel();
		result = result * PRIME + ($label == null ? 43 : $label.hashCode());
		final java.lang.Object $tag = this.getTag();
		result = result * PRIME + ($tag == null ? 43 : $tag.hashCode());
		final java.lang.Object $resourceId = this.getResourceId();
		result = result * PRIME + ($resourceId == null ? 43 : $resourceId.hashCode());
		final java.lang.Object $resourceLinkId = this.getResourceLinkId();
		result = result * PRIME + ($resourceLinkId == null ? 43 : $resourceLinkId.hashCode());
		final java.lang.Object $submission = this.getSubmission();
		result = result * PRIME + ($submission == null ? 43 : $submission.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "LineItem(id=" + this.getId() + ", scoreMaximum=" + this.getScoreMaximum() + ", label=" + this.getLabel() + ", tag=" + this.getTag() + ", resourceId=" + this.getResourceId() + ", resourceLinkId=" + this.getResourceLinkId() + ", submission=" + this.getSubmission() + ")";
	}

	@java.lang.SuppressWarnings("all")
	public LineItem() {
	}
}
