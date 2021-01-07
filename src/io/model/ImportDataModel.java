// License: AGPL. For details, see LICENSE file.
package io.model;

import org.openstreetmap.josm.data.osm.DataSet;

/**
 * Import data model class holding imported data
 *
 * @author rebsc
 */
public class ImportDataModel {

    private DataSet ds;

    public void setImportData(DataSet data) {
        ds = data;
    }

    public DataSet getData(){
        return ds;
    }


}
