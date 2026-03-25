package com.ashmaster.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    private val highlightItems = listOf(
        "Unified command palette wired to AshForge orchestrators",
        "Auto-sync shell history across sessions with conflict safety",
        "Faster sandbox boot with pre-warmed worker pools",
        "Inline release notes shipped directly into the prompt HUD",
        "Telemetry guards to keep experiments safe by default"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val highlightGroup = findViewById<ChipGroup>(R.id.chipHighlights)
        renderHighlights(highlightGroup)
    }

    private fun renderHighlights(highlightGroup: ChipGroup) {
        highlightItems.forEach { label ->
            highlightGroup.addView(createStaticChip(label))
        }
    }

    private fun createStaticChip(label: String): Chip {
        return Chip(this).apply {
            text = label
            isCheckable = false
            isClickable = false
            isCloseIconVisible = false
            textAlignment = Chip.TEXT_ALIGNMENT_TEXT_START
        }
    }
}
