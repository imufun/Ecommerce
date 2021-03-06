package dw.fdb.com.fdbapp.model.address;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;

import dw.fdb.com.fdbapp.R;
import dw.fdb.com.fdbapp.adapter.CustomListAdapter;
import dw.fdb.com.fdbapp.model.Item;


public class AddressInvoice implements Item {
    @Expose
    private String company;
    @SerializedName("id_address")
    @Expose
    private int idAddress;
    @Expose
    private String alias;
    @Expose
    private String lastname;
    @Expose
    private String firstname;
    @Expose
    private String address1;
    @Expose
    private String address2;
    @Expose
    private String postcode;
    @Expose
    private String city;
    @Expose
    private String phone;
    @SerializedName("phone_mobile")
    @Expose
    private String phoneMobile;

    /**
     * @return The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return The idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     * @param idAddress The id_address
     */
    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    /**
     * @return The alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias The alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return The lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname The lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return The firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname The firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return The address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 The address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return The address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 The address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return The postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode The postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The phoneMobile
     */
    public String getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * @param phoneMobile The phone_mobile
     */
    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(company).append(idAddress).append(alias).append(lastname).append(firstname).append(address1).append(address2).append(postcode).append(city).append(phone).append(phoneMobile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressInvoice) == false) {
            return false;
        }
        AddressInvoice rhs = ((AddressInvoice) other);
        return new EqualsBuilder().append(company, rhs.company).append(idAddress, rhs.idAddress).append(alias, rhs.alias).append(lastname, rhs.lastname).append(firstname, rhs.firstname).append(address1, rhs.address1).append(address2, rhs.address2).append(postcode, rhs.postcode).append(city, rhs.city).append(phone, rhs.phone).append(phoneMobile, rhs.phoneMobile).isEquals();
    }

    @Override
    public View getView(LayoutInflater inflator, View convertView, ViewGroup parent, final int position, final CustomListAdapter.AdapterOnClickListner adapterOnClickListner) {

        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflator.inflate(R.layout.address_invoice_layout_fragment, parent, false);
            holder.first_name = (TextView) convertView.findViewById(R.id.first_name);
            holder.last_name = (TextView) convertView.findViewById(R.id.last_name);
            holder.adresse1 = (TextView) convertView.findViewById(R.id.prix_ttc);
            holder.country = (TextView) convertView.findViewById(R.id.country);
            holder.mobile = (TextView) convertView.findViewById(R.id.mobile);
            holder.edit_address = (Button) convertView.findViewById(R.id.edit_address_invoice);
            holder.remove_address = (Button) convertView.findViewById(R.id.remove_address_invoice);
            holder.edit_address.setTag(Integer.valueOf(position));
            holder.remove_address.setTag(Integer.valueOf(position));
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.first_name.setText(getFirstname());
        holder.last_name.setText(getLastname());
        holder.adresse1.setText(getAddress1());
        holder.country.setText(getCity());
        holder.mobile.setText(getPhoneMobile());
        holder.edit_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterOnClickListner.buttonClicked(v, position);
            }
        });

        holder.remove_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterOnClickListner.buttonClicked(v, position);
            }
        });

        return convertView;
    }

    @Override
    public int getId(int position) {
        return 0;
    }

    @Override
    public int getViewType() {
        return CustomListAdapter.AddressType.ADDRESS_INVOICE_LAYOUT.ordinal();
    }

    @SuppressWarnings("serial")
    public static class AddressList extends ArrayList<AddressInvoice> {
    }

    public static class ViewHolder {
        TextView first_name;
        TextView last_name;
        TextView adresse1;
        TextView country;
        TextView mobile;
        Button edit_address;
        Button remove_address;
    }

}
