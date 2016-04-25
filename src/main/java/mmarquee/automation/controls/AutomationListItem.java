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

package mmarquee.automation.controls;

import mmarquee.automation.AutomationElement;
import mmarquee.automation.pattern.PatternNotFoundException;
import mmarquee.automation.pattern.SelectionItem;
import mmarquee.automation.uiautomation.IUIAutomation;

/**
 * Created by inpwt on 09/02/2016.
 *
 * Wrapper for the ListItem element.
 */
public class AutomationListItem extends AutomationBase {

    private SelectionItem selectItemPattern;

    /**
     * Constructor for the AuyomationListItem
     * @param element The underlying automation element
     * @param automation The automation library
     */
    public AutomationListItem(AutomationElement element, IUIAutomation automation) {
        super(element, automation);

        try {
            this.selectItemPattern = this.getSelectItemPattern();
        } catch (PatternNotFoundException ex) {
            // Handle this nicely somehow
        }
    }

    /**
     * Selects this item
     */
    public void select() {
        this.selectItemPattern.select();
    }

}
