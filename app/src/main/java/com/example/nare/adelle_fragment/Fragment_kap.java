package com.example.nare.adelle_fragment;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class Fragment_kap extends Fragment implements View.OnClickListener {

    ImageView imgphone, imgfb, imginsta, imgwapp, imgviber;
    TextView wappnum, vibernum;
    Animation animation, animation1;
    boolean bb1 = true, bb2 = true;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kap, container, false);

        imgphone = (ImageView) view.findViewById(R.id.phone);
        imgfb = (ImageView) view.findViewById(R.id.fb);
        imginsta = (ImageView) view.findViewById(R.id.insta);
        imgwapp = (ImageView) view.findViewById(R.id.wapp);
        imgviber = (ImageView) view.findViewById(R.id.viber);
        wappnum = (TextView) view.findViewById(R.id.wappnum);
        vibernum = (TextView) view.findViewById(R.id.vibernum);

        imgphone.setOnClickListener(this);
        imgfb.setOnClickListener(this);
        imginsta.setOnClickListener(this);
        imgwapp.setOnClickListener(this);
        imgviber.setOnClickListener(this);

        animation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim);
        animation.setDuration(1000);
        animation1 = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim1);
        animation1.setDuration(1000);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phone:
                imgphone.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + "+37444717111"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                break;
            case R.id.fb:
                imgfb.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        String uri = "http://facebook.com/flowers.adelle";
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent4);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
            case R.id.insta:
                imginsta.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Uri uri = Uri.parse("http://instagram.com/_u/adelle_flowers");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                        intent2.setPackage("com.instagram.android");


                        try {
                            startActivity(intent2);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://instagram.com/adelle_flowers")));
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
            case R.id.wapp:
                if (bb1) {
                    imgwapp.startAnimation(animation);
                    animation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            wappnum.setText("+374(44)71-71-11");
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    bb1 = false;
                } else if (!bb1) {
                    imgwapp.startAnimation(animation1);
                    animation1.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            wappnum.setText("");
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    bb1 = true;
                }
                break;
            case R.id.viber:
                if (bb2) {
                    imgviber.startAnimation(animation);
                    animation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            vibernum.setText("+374(44)71-71-11");
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    bb2 = false;
                } else if (!bb2) {
                    imgviber.startAnimation(animation1);
                    animation1.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            vibernum.setText("");
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    bb2 = true;
                }

                break;

        }
    }
}

