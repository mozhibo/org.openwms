/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.web.flex.client.common.command
{
    import com.adobe.cairngorm.commands.ICommand;
    import com.adobe.cairngorm.control.CairngormEvent;
    
    import mx.controls.Alert;
    import mx.rpc.IResponder;
    
    import org.openwms.common.domain.LocationType;
    import org.openwms.web.flex.client.common.business.LocationDelegate;
    import org.openwms.web.flex.client.common.event.LocationTypeEvent;

    /**
     * A SaveLocationTypeCommand.
     *
     * @author <a href="mailto:openwms@googlemail.com">Heiko Scherrer</a>
     * @version $Revision: 700 $
     */
    public class SaveLocationTypeCommand implements IResponder, ICommand
    {

        public function SaveLocationTypeCommand()
        {
            super();
        }

        public function result(data:Object):void
        {
            new LocationTypeEvent(LocationTypeEvent.LOAD_ALL_LOCATION_TYPES).dispatch();
            /*var types:ArrayCollection = CommonModelLocator.getInstance().allLocationTypes;
            for each (var type:LocationType in types)
            {
            	if (type.type == (data as LocationType).type)
            	{
            		type = (data as LocationType);
            	}
            }
            */
        }

        public function fault(info:Object):void
        {
            Alert.show("Could not save Location Type");
        }

        public function execute(event:CairngormEvent):void
        {
            if (event.data == null)
            {
                Alert.show("Please select a Location Type first");
                return;
            }
            var delegate:LocationDelegate = new LocationDelegate(this)
            delegate.saveLocationType(event.data as LocationType);
        }

    }
}