@file:Suppress("NOTHING_TO_INLINE")

package me.tatarka.bindingcollectionadapter2

import androidx.annotation.LayoutRes
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass

/**
 * Maps the given type to the given id and layout.
 *
 * @see OnItemBindClass.map
 */
inline fun <reified T> OnItemBindClass<in T>.map(
    variableId: Int,
    @LayoutRes layoutRes: Int
): OnItemBindClass<in T> =
    map(T::class.java, variableId, layoutRes)

/**
 * Maps the given type to the given callback.
 *
 * @see OnItemBindClass.map
 */
inline fun <reified T> OnItemBindClass<in T>.map(
    onItemBind: OnItemBind<T>
): OnItemBindClass<in T> =
    map(T::class.java, onItemBind)
