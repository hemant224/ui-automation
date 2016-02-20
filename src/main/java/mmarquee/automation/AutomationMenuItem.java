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
package mmarquee.automation;

import mmarquee.automation.uiautomation.*;

/**
 * Created by inpwt on 10/02/2016.
 */
public class AutomationMenuItem extends AutomationBase {
    private IUIAutomationInvokePattern invokePattern;
    private IUIAutomationExpandCollapsePattern expandPattern;

    public AutomationMenuItem(IUIAutomationElement element, IUIAutomation uiAuto) {
        super(element, uiAuto);
        try {
            this.invokePattern = this.getInvokePattern();
        } catch (Exception ex) {
            // All is OK
        }

        try {
            this.expandPattern = this.getExpandCollapsePattern();
        } catch (Exception ex) {
            // All is OK
        }
    }

    /**
     * Invoke the expand pattern for the menu item
     */
    public void expand() {
        if (this.expandPattern != null) {
            this.expandPattern.expand();
        }
    }

    /**
     * Invoke the click pattern for the menu item
     */
    public void click() {
        if (this.invokePattern != null) {
            this.invokePattern.invoke();
        }
    }

    public AutomationMenuItem getMenuItem (String name) {
        IUIAutomationElement item = this.element.findFirst(TreeScope.TreeScope_Descendants,
                uiAuto.createAndCondition(
                        uiAuto.createPropertyCondition(PropertyID.NamePropertyId, name),
                        uiAuto.createPropertyCondition(PropertyID.ControlTypePropertyId, ControlTypeID.MenuItemControlTypeId)));

        return new AutomationMenuItem(item, this.uiAuto);
    }
}
