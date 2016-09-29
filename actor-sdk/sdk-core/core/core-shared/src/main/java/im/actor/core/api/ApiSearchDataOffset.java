package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class ApiSearchDataOffset extends ApiSearchCondition {

    private int offset;

    public ApiSearchDataOffset(@NotNull int offset) {
        this.offset = offset;
    }

    public ApiSearchDataOffset() {

    }

    public int getHeader() {
        return 9;
    }

    @NotNull
    public int getOffset() {
        return this.offset;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.offset = values.getInt(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.offset);
    }

    @Override
    public String toString() {
        String res = "struct SearchDataOffset{";
        res += "offset=" + this.offset;
        res += "}";
        return res;
    }

}