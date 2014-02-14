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
package org.openwms.core.service;

/**
 * A ExceptionCodes.
 * 
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 * @version $Revision: $
 * @since 0.2
 */
public class ExceptionCodes {

    public static final String TECHNICAL_RT_ERROR = "general.technical.error";
    /** Thrown if an Role already exists and cannot be created. */

    /** Thrown if a User to persist already exists. */
    public static final String USER_ALREADY_EXISTS = "user.already.exists";
    /** Thrown if a User is looked up but hasn't been found. */
    public static final String USER_NOT_EXIST = "user.not.exist";
    /** Thrown if removing a User was requested with <code>null</code> argument. */
    public static final String USER_REMOVE_NOT_BE_NULL = "user.remove.null.argument";
    /** Thrown if creating a User was requested with <code>null</code> argument. */
    public static final String USER_CREATE_NOT_BE_NULL = "user.create.null.argument";
    /** Thrown if saving a User was requested with <code>null</code> argument. */
    public static final String USER_SAVE_NOT_BE_NULL = "user.save.null.argument";
    /** Thrown if saving a User's profile was requested with <code>null</code> argument. */
    public static final String USER_PROFILE_SAVE_NOT_BE_NULL = "user.profile.save.null.argument";

    /** Thrown if a Role to persist already exists. */
    public static final String ROLE_ALREADY_EXISTS = "role.already.exists";
    /** Thrown if a Role is looked up but hasn't been found. */
    public static final String ROLE_NOT_EXIST = "role.not.exist";
    /** Thrown if removing a Role was requested with <code>null</code> argument. */
    public static final String ROLE_REMOVE_NOT_BE_NULL = "role.remove.null.argument";
    /** Thrown if creating a Role was requested with <code>null</code> argument. */
    public static final String ROLE_CREATE_NOT_BE_NULL = "role.create.null.argument";
    /** Thrown if saving a Role was requested with <code>null</code> argument. */
    public static final String ROLE_SAVE_NOT_BE_NULL = "role.save.null.argument";

}