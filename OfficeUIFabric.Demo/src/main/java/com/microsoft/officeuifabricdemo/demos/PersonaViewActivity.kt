/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.officeuifabricdemo.demos

import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import com.microsoft.officeuifabric.persona.AvatarSize
import com.microsoft.officeuifabric.persona.PersonaView
import com.microsoft.officeuifabricdemo.DemoActivity
import com.microsoft.officeuifabricdemo.R
import kotlinx.android.synthetic.main.activity_persona_view.*

class PersonaViewActivity : DemoActivity() {
    override val contentLayoutId: Int
        get() = R.layout.activity_persona_view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add Persona programmatically
        createNewPersonaFromCode()
    }

    private fun createNewPersonaFromCode() {
        val personaView = PersonaView(this)
        personaView.avatarSize = AvatarSize.SMALL
        personaView.name = resources.getString(R.string.persona_name_mauricio_august)
        personaView.email = resources.getString(R.string.persona_email_mauricio_august)
        personaView.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        persona_layout.addView(personaView)
    }
}