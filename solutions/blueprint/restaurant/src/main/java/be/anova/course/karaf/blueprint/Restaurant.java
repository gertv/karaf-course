/*
 * (c) 2010, anova r&d bvba.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package be.anova.course.karaf.blueprint;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Restaurant implementation for Karaf exercise
 */
public class Restaurant {

    private static final Log LOG = LogFactory.getLog(Restaurant.class);

    private Kitchen kitchen;
    private String name;

    private List<Person> staff = new LinkedList<Person>();

    public Restaurant(String name) {
        super();
        this.name = name;

        LOG.info("Starting a new restaurant : " + name);
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;

        LOG.info(String.format("%s is now using %s cuisine", name, kitchen.getCuisine()));
        LOG.info(String.format("%s has a new chef: %s", name, kitchen.getChef()));
    }

    public void addStaff(Person person) {
        staff.add(person);

        LOG.info(String.format("%s joins the team at %s", person, name));
    }
    
    public void removeStaff(Person person) {
        staff.remove(person);

        LOG.info(String.format("%s leaves the team at %s", person, name));
    }
}
