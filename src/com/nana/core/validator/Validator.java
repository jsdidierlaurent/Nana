/*
 * Copyright (c) 2015 - Seb&Lulu
 * Author(s) : jsdidierlaurent
 * Date : 06 mars 2015
 */
package com.nana.core.validator;

import org.eclipse.jdt.annotation.NonNull;

import com.nana.core.state.interfaces.IState;
import com.nana.core.trigger.TriggerState;
import com.nana.core.validator.interfaces.IValidator;

public abstract class Validator<T> implements IValidator {
	@NonNull private final IState<T> _state;
	@NonNull private final T _value;

	/** Sert à valider un Etat **/
	public Validator(@NonNull final IState<T> state, @NonNull final T value) {
		_state = state;
		_value = value;
	}

	@Override
	public boolean isValid() {
		return _state.isValid(_value);
	}

	public IState<T> getState() {
		return _state;
	}

	@Override
	public void register(@NonNull final TriggerState trigger) {
		_state.register(trigger);
	}
}