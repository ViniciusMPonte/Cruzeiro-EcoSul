package unicsul.pdm.cruzeiroecosul.componentes;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.google.android.material.card.MaterialCardView;

import unicsul.pdm.cruzeiroecosul.R;

public class CardHorizontal extends MaterialCardView {

    public CardHorizontal(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card_horizontal, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardHorizontal);

        TextView titulo = findViewById(R.id.cardHorizontalTitulo);
        TextView descricao = findViewById(R.id.cardHorizontalDescricao);
        ImageView icone = findViewById(R.id.cardHorizontalIcone);
        View fundoIcone = findViewById(R.id.cardHorizontalFundoIcone);
        LinearLayout container = findViewById(R.id.cardHorizontalContainer);

        titulo.setText(a.getString(R.styleable.CardHorizontal_titulo));
        descricao.setText(a.getString(R.styleable.CardHorizontal_descricao));
        icone.setImageResource(a.getResourceId(R.styleable.CardHorizontal_icone, 0));

        if (a.hasValue(R.styleable.CardHorizontal_corTitulo)) {
            titulo.setTextColor(a.getColor(R.styleable.CardHorizontal_corTitulo, 0));
        }

        if (a.hasValue(R.styleable.CardHorizontal_corDescricao)) {
            descricao.setTextColor(a.getColor(R.styleable.CardHorizontal_corDescricao, 0));
        }

        icone.setColorFilter(a.getColor(R.styleable.CardHorizontal_corIcone,
                ContextCompat.getColor(context, R.color.primary)));

        if (a.hasValue(R.styleable.CardHorizontal_corFundoIcone)) {
            fundoIcone.setBackgroundTintList(ColorStateList.valueOf(
                    a.getColor(R.styleable.CardHorizontal_corFundoIcone, 0)));
        }

        if (a.hasValue(R.styleable.CardHorizontal_corCard)) {
            setCardBackgroundColor(a.getColor(R.styleable.CardHorizontal_corCard, 0));
        }

        if (a.hasValue(R.styleable.CardHorizontal_paddingContainer)) {
            int padding = a.getDimensionPixelSize(R.styleable.CardHorizontal_paddingContainer, 0);
            container.setPadding(padding, padding, padding, padding);
        }

        a.recycle();
    }
}