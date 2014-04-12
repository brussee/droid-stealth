package com.stealth.dialog;

import java.util.ArrayList;

/**
 * An object to give the dialogManager in order to setup the dialog
 * Created by OlivierHokke on 11-Apr-14.
 */
public class DialogOptions {
	private int mTitle;
	private int mDescription;
	private int mPositive;
	private int mNegative;
	private boolean mReverseColors = false;
	private boolean mPositiveButtonEnabled = true;
	private boolean mNegativeButtonEnabled = true;
	private ArrayList<DialogInput> mInputs;

	public ArrayList<DialogInput> getInputs() {
		return mInputs;
	}

	/**
	 * Set the list of inputs that the dialog can show.
	 * @param inputs the list of input settings
	 * @return itself, for call chaining
	 */
	public DialogOptions setInputs(ArrayList<DialogInput> inputs) {
		mInputs = inputs;
		return this;
	}

	/**
	 * Add an input field to the dialog
	 * @param input the input settings
	 * @return itself, for call chaining
	 */
	public DialogOptions addInput(DialogInput input) {
		if (mInputs == null) {
			mInputs = new ArrayList<DialogInput>();
		}
		mInputs.add(input);
		return this;
	}

	public boolean isReverseColors() {
		return mReverseColors;
	}

	/**
	 * Should the button colors be reversed?
	 * @param reverseColors true for green on negative button, red on positive button
	 * @return itself, for call chaining
	 */
	public DialogOptions setReverseColors(boolean reverseColors) {
		mReverseColors = reverseColors;
		return this;
	}

	public boolean isPositiveButtonEnabled() {
		return mPositiveButtonEnabled;
	}

	public DialogOptions setPositiveButtonEnabled(boolean positiveButtonEnabled) {
		mPositiveButtonEnabled = positiveButtonEnabled;
		return this;
	}

	public boolean isNegativeButtonEnabled() {
		return mNegativeButtonEnabled;
	}

	public DialogOptions setNegativeButtonEnabled(boolean negativeButtonEnabled) {
		mNegativeButtonEnabled = negativeButtonEnabled;
		return this;
	}

	public int getTitle() {
		return mTitle;
	}

	public DialogOptions setTitle(int title) {
		mTitle = title;
		return this;
	}

	public int getDescription() {
		return mDescription;
	}

	public DialogOptions setDescription(int descriptionResource) {
		mDescription = descriptionResource;
		return this;
	}

	public int getPositive() {
		return mPositive;
	}

	public DialogOptions setPositive(int positiveResource) {
		mPositive = positiveResource;
		return this;
	}

	public int getNegative() {
		return mNegative;
	}

	public DialogOptions setNegative(int negativeResource) {
		mNegative = negativeResource;
		return this;
	}
}