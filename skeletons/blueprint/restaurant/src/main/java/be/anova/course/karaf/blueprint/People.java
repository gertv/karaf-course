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

/**
 * Factory class for creating {@link Person} instances
 */
public class People {

    /**
     * Create a new person 
     */
    public static Person createPerson(final String firstName, final String lastName) {
        return new Person() {

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            @Override
            public String toString() {
                return String.format("%s %s", firstName, lastName);
            }
        };
    }
}
