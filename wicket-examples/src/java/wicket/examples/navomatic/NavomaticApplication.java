/*
 * $Id$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicket.examples.navomatic;

import wicket.ApplicationSettings;
import wicket.WebApplication;

/**
 * WicketServlet class for hello world example.
 * @author Jonathan Locke
 */
public class NavomaticApplication extends WebApplication
{
    /**
     * Constructor.
     */
    public NavomaticApplication()
    {
        getPages().setHomePage(Page1.class);
        getSettings().setUnexpectedExceptionDisplay(ApplicationSettings.SHOW_NO_EXCEPTION_PAGE);
    }
}
