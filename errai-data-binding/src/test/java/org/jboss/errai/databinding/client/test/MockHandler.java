/*
 * Copyright 2012 JBoss, a division of Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.errai.databinding.client.test;

import java.util.ArrayList;
import java.util.List;

import org.jboss.errai.databinding.client.api.PropertyChangeEvent;
import org.jboss.errai.databinding.client.api.PropertyChangeHandler;

/**
 * {@link PropertyChangeHandler} for testing purposes.
 *
 * @author David Cracauer <dcracauer@gmail.com>
 */
public class MockHandler implements PropertyChangeHandler {
  List<PropertyChangeEvent> events = new ArrayList<PropertyChangeEvent>();

  @Override
  public void onPropertyChange(PropertyChangeEvent event) {
    System.out.println("======= " + events.size());
    new Exception().printStackTrace();
    events.add(event);
  }

  public List<PropertyChangeEvent> getEvents() {
    return events;
  }
}