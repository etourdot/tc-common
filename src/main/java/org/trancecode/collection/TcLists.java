/*
 * Copyright (C) 2011 Herve Quiroz
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 */
package org.trancecode.collection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

import java.util.List;

/**
 * Utility methods related to {@link List}.
 * 
 * @author Herve Quiroz
 */
public final class TcLists
{
    public static <T> List<T> immutableList(final Iterable<T> elements, final T newElement)
    {
        return ImmutableList.copyOf(Iterables.concat(elements, ImmutableList.of(newElement)));
    }

    public static <T> List<T> immutableList(final T prefixElement, final Iterable<T> elements)
    {
        return ImmutableList.copyOf(Iterables.concat(ImmutableList.of(prefixElement), elements));
    }

    private TcLists()
    {
        // No instantiation
    }
}
