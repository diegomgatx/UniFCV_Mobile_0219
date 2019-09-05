package br.edu.unifcv.carros;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    TextView mTxtModelo;
    TextView mTxtDetalhe;

    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mTxtModelo = itemView.findViewById(R.id.txtModelo);
        this.mTxtDetalhe = itemView.findViewById(R.id.txtDetalhe);
    }

    public void bindData(final CarroModel carroModel, final onClickViewListener mOnClickViewListener) {
        this.mTxtModelo.setText(carroModel.getModelo());

        this.mTxtDetalhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClickViewListener.click(carroModel.getId());
            }
        });

    }
}
