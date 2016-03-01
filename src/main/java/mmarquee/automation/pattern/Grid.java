/*
 * Copyright 2016 inpwtepydjuf@gmail.com
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
package mmarquee.automation.pattern;

import mmarquee.automation.uiautomation.*;

/**
 * Created by inpwt on 25/02/2016.
 */
public class Grid extends BasePattern {
    /**
     * Get the item associated with the given cell
     * @param x Cell X position
     * @param y Cell Y position
     * @return The item associated with the cell
     */
    public IUIAutomationElement getItem(int x, int y) {
        return ((IUIAutomationGridPattern)pattern).getItem(x, y);
    }

    /**
     * Gets the row count
     * @return The tow count
     */
    public int rowCount() {
        return ((IUIAutomationGridPattern)pattern).currentRowCount();
    }

    /**
     * Gets the coloumn count
     * @return The column count
     */
    public int columnCount() {
        return ((IUIAutomationGridPattern)pattern).currentColumnCount();
    }
}